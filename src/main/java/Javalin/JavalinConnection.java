package Javalin;

import Javalin.Automobili.MarkaController;
import io.javalin.Javalin;

public class JavalinConnection {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7777);
      //  app.get("/", ctx -> ctx.result("Cakes plays"));
/*        app.get("/cakes", CakesController::getAllCakes);
        app.get("/cakes/{special}", CakesController::getSpecialCake);
*/

        app.get("/", ctx -> ctx.result("Cars plays"));
        app.get("/marka", MarkaController::getMarkas);
        app.get("/marka/{special}", MarkaController::getSpecialMarka);
    }
}
