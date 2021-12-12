package az.library_management.controller;

import az.library_management.db.Database;
import az.library_management.model.Category;
import az.library_management.template_engine.TemplateEngine;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CategoryServlet extends HttpServlet {
    private final TemplateEngine templateEngine;

    public CategoryServlet(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HashMap<String, Object> data = new HashMap<>();
        List<Category> categories = new Database().findAllCategory();
//        List<Category> categories = Arrays.asList(
//                new Category(1, "A"),
//                new Category(1, "A"),
//                new Category(1, "A"),
//                new Category(1, "A")
//        );
        data.put("categories", categories);
        templateEngine.render("categories.ftl", data, resp);
    }
}
