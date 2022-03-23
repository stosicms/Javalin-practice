package Javalin.Automobili;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.xcontent.XContentType;

public class MakeIndex extends ElasticLog {
    public static void main(String[] args) {
        final byte[] bytes = null;

/*        final IndexRequest indexRequest = new IndexRequest();
        indexRequest.id("automobil");
        indexRequest.source(bytes, XContentType.JSON);

        final IndexResponse response = client.index(indexRequest, RequestOptions.DEFAULT);
*/
        BulkRequest bulkRequest = new BulkRequest();

        bulkRequest.add(new IndexRequest("automobil").id("001").source(XContentType.JSON, "marka", "BMW"));
        bulkRequest.add(new IndexRequest("automobil").id("002").source(XContentType.JSON, "marka", "MERCEDES"));
        bulkRequest.add(new IndexRequest("automobil").id("003").source(XContentType.JSON, "marka", "AUDI"));
        bulkRequest.add(new IndexRequest("automobil").id("004").source(XContentType.JSON, "marka", "OPEL"));
        bulkRequest.add(new IndexRequest("automobil").id("005").source(XContentType.JSON, "marka", "VOLKSWAGEN"));

        client.bulk(bulkRequest, RequestOptions.DEFAULT);
    }
}
