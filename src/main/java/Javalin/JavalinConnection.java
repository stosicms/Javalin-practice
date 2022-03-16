package Javalin;

import io.javalin.Javalin;

public class JavalinConnection {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
      //  app.get("/", ctx -> ctx.result("Cakes plays"));
        app.get("/cakes", CakesController::getAllCakes);
        app.get("/cakes/{special}", CakesController::getSpecialCake);


    }
}
