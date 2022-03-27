package ServicePractice;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.common.xcontent.XContentType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bulk {
    List<String> lista = Arrays.asList("BMW", "MERCEDES", "OPEL", "VOLKSWAGEN");
    BulkRequest bulkRequest = new BulkRequest();
    final byte[] bytes = null;

    public <T> void bulkAdd (List <T> lista, String index, String field) {
        for (var user: lista) {
            bulkRequest.add(new IndexRequest(index).source(XContentType.JSON, field, user));
        }
    }
}

