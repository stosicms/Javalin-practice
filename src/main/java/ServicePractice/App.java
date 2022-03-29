package ServicePractice;

public class App {
    public static void main(String[] args) {
        var ellog = ElasticLog.getInstance();
        var jalog = JavalinLog.getInstance();
        Bulk bulk = new Bulk();
        bulk.bulkAdd(new String[]{"BMW", "Mercedes", "Opel", "Ford"}, "automobil", "marka");


        jalog.get("/", ctx -> ctx.result("Automobili"));
        jalog.get("/marka", AutomobilController::getAuto);
        jalog.get("/marka/{special}", AutomobilController::getSpecialMarka);
    }
}
