package az.library_management.controller;

import az.library_management.db.Database;
import az.library_management.model.Accessor;
import az.library_management.template_engine.TemplateEngine;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

public class AccessorServlet extends HttpServlet {
    private final TemplateEngine templateEngine;

    public AccessorServlet(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HashMap<String, Object> data = new HashMap<>();
        List<Accessor> accessors = new Database().findAllAccessor();
        data.put("accessors", accessors);
        templateEngine.render("accessors.ftl", data, resp);
    }
}