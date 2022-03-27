package ServicePractice;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

public class ElasticLog {

    private static ElasticsearchClient client = null;

    private ElasticLog() {}

    public static ElasticsearchClient getInstance() {
        if (client == null) {
            RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
            ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
            ElasticsearchClient client = new ElasticsearchClient(transport);
        }
        return client;
    }
}
