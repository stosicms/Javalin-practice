package ServicePractice;

import io.javalin.Javalin;

public class JavalinLog {
    public static Javalin getInstance() {
        return Javalin.create().start(7777);
    }
}
