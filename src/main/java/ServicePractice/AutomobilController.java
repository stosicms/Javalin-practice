package ServicePractice;

import io.javalin.http.Context;

import java.util.Arrays;

public class AutomobilController {


    public static String[] auto = AutomobiliSearch.searchElastic("automobili", App.main(String.valueOf());

    public static void getAuto (Context context) {
        context.json(auto);
    }
    public static void getSpecialMarka (Context context) {
        for (String marka: auto) {
            if (marka.contains(context.pathParam("special")))
                context.result(marka);
            return;
        }
        System.out.println("Marka nije pronadjena!");
    }
    @Override
    public String toString() {
        return "Marka:" + Arrays.toString(auto);
    }
}
