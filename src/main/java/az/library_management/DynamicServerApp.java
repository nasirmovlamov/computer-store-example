package az.library_management;

import az.library_management.controller.*;
import az.library_management.template_engine.TemplateEngine;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class DynamicServerApp {
    public static void main(String[] args) throws Exception {
        final Server server = new Server(8081);
        final ServletContextHandler handler = new ServletContextHandler();

        TemplateEngine templateEngine = TemplateEngine.folder("templates");

        handler.addServlet(new ServletHolder(new HomePageServlet()), "/");
        handler.addServlet(new ServletHolder(new UserServlet(templateEngine)), "/users");

        server.setHandler(handler);
        server.start();
        server.join();
    }
}