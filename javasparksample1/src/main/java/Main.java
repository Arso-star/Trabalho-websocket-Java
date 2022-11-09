import spark.ModelAndView;
import spark.Request;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        exception(Exception.class, (e, req, res) -> e.printStackTrace()); // print all exceptions
        staticFiles.location("/public");
        port(8081);

        //get("/", (req, res) -> renderTodos(req));

        get("/hello", (req, res) -> "Hello World");

        post("/cliente", (req, res) -> "Olá cliente");
    }

    private static String renderTodos(Request req) {
        Map<String, Object> model = new HashMap<>();

        Integer a = 10;
        Integer b = 30;
        Integer resultado = a + b;

        model.put("nome", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "velocity/index.vm"));
    }
}


