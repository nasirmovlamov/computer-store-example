package az.library_management.controller;

import az.library_management.model.Users;
import az.library_management.template_engine.TemplateEngine;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UsersServlet extends HttpServlet {
    private final TemplateEngine templateEngine;

    public UsersServlet(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HashMap<String, Object> data = new HashMap<>();
//        List<Users> users = new Database().findAllUser();
        List<Users> users = Arrays.asList(
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021),
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021),
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021),
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021),
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021),
                new Users(1, 1, "Elvin", "BCS", "111", "ABC", 2021)
        );
        data.put("users", users);
        templateEngine.render("users.ftl", data, resp);
    }
}