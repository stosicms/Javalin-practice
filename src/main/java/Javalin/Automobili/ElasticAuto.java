package Javalin.Automobili;

import Elasticsearch.Product;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import java.io.IOException;

public class ElasticAuto extends ElasticLog{
    public static String[] elastic() {

        SearchResponse<Automobili> search = null;
        try {
            search = client.search(s->s.index("automobili").query(q->q.term(t->t.field("name").value(v->v.stringValue("BMW")))),
                    Automobili.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert search != null;
        return new String[]{search.toString()};

    }

    private static void processProduct(Automobili automobili) {
        System.out.println(automobili);
    }
}
