package Javalin.Automobili;

import io.javalin.http.Context;

import java.util.Arrays;

public class MarkaController {

    public static String[] markas = ElasticAuto.elastic();

    public static void getMarkas(Context context) {
        context.json(markas);
    }
    public static void getSpecialMarka (Context context) {
        for (String marka: markas) {
            if (marka.contains(context.pathParam("special")))
                context.result(marka);
            return;
        }
        System.out.println("Model nije pronadjen!");
    }

    @Override
    public String toString() {
        return "MarkaController{" +
                "markas=" + Arrays.toString(markas) +
                '}';
    }
}
