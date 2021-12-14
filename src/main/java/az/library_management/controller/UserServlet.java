package az.library_management.controller;

import az.library_management.db.Database;
import az.library_management.model.User;
import az.library_management.template_engine.TemplateEngine;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

public class UserServlet extends HttpServlet {
    private final TemplateEngine templateEngine;

    public UserServlet(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HashMap<String, Object> data = new HashMap<>();
        List<User> users = new Database().findAllUser();
        data.put("users", users);
        templateEngine.render("users.ftl", data, resp);
    }
}