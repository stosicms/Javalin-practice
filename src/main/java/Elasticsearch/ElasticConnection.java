package Elasticsearch;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import java.io.IOException;

public class ElasticConnection {
    public static void main(String[] args) throws IOException {

        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
        ElasticsearchClient client = new ElasticsearchClient(transport);

        SearchResponse<Product> search = client.search(s->s.index("shop_index").query(q->q.term(t->t.field("id").value(v->v.stringValue("urn:ngsi-ld:Shelf:unit002")))),
                Product.class);

        System.out.println("HEY: " + search.toString());

        for (Hit<Product> hit: search.hits().hits()) {
            processProduct(hit.source());
        }

    }

    private static void processProduct(Product source) {
        System.out.println(source);
    }
}
