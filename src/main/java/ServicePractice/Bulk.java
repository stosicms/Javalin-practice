package ServicePractice;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.common.xcontent.XContentType;

public class Bulk {
    BulkRequest bulkRequest = new BulkRequest();
    final byte[] bytes = null;

    public <T> void bulkAdd(String[] lista, String index, String field) {
        for (var user : lista) {
            bulkRequest.add(new IndexRequest(index).source(XContentType.JSON, field, user));
        }
    }
}

