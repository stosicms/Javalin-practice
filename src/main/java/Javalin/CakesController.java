package Javalin;

import io.javalin.http.Context;

import java.util.Arrays;

public class CakesController {

    static String[] availableCakes = {"carrot cake", "chocolate cake", "cheesecake"};

    public static void getAllCakes(Context context) {
        context.json(availableCakes);
    }

    public static void getSpecialCake(Context context) {
        for (String cake: availableCakes){
            if (cake.contains(context.pathParam("special"))){
                context.result(cake);
                return;
            }
        }
        context.result("No cake found");
    }
}
