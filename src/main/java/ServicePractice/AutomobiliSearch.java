package ServicePractice;

import Javalin.Automobili.Automobili;
import Javalin.Automobili.ElasticLog;
import co.elastic.clients.elasticsearch.core.SearchResponse;

import java.io.IOException;

public class AutomobiliSearch {
    public static String[] searchElastic(String index, String field, String value) {

        SearchResponse<Automobili> search = null;
        try {
            search = ElasticLog.getInstance().search(s->s.index(index).query(q->q.term(t->t.field(field).value(v->v.stringValue(value)))),
                    Javalin.Automobili.Automobili.class);
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