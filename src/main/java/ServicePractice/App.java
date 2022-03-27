package ServicePractice;

public class App {
    public static void main(String[] args) {
        var ellog = ElasticLog.getInstance();
        var jalog = JavalinLog.getInstance();



        jalog.get("/", ctx -> ctx.result("Automobili"));
        jalog.get("/marka", AutomobilController::getAuto);
    }
}
