package Javalin.Automobili;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

public class ElasticLog {

        static RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200)).build();
        static ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());
        static ElasticsearchClient client = new ElasticsearchClient(transport);

}
