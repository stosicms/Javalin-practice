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

import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MakeIndex {
    private static List<String> lista = Arrays.asList("BMW", "MERCEDES", "OPEL", "VOLKSWAGEN");
    BulkRequest bulkRequest = new BulkRequest();
    public static void main(String[] args) {
        final byte[] bytes = null;

/*        final IndexRequest indexRequest = new IndexRequest();
        indexRequest.id("automobil");
        indexRequest.source(bytes, XContentType.JSON);

        final IndexResponse response = client.index(indexRequest, RequestOptions.DEFAULT);


    }
    public <T> void bulkAdd (List <T> lista) {
        for (var user: lista) {
            bulkRequest.add(new IndexRequest("automobil").source(XContentType.JSON, "marka", user));
        }
        try {

            ElasticLog.getInstance().bulk(bulkRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

