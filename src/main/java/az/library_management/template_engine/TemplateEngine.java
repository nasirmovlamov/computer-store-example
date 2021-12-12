package az.library_management.template_engine;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import static az.library_management.template_engine.Directory.RESOURCE_DIR;

public class TemplateEngine {
    private final String ENCODING = String.valueOf(StandardCharsets.UTF_8);
    private final Configuration config;

    private TemplateEngine(String path) throws IOException {
        this.config = new Configuration(Configuration.VERSION_2_3_30) {{
            setDirectoryForTemplateLoading(new File(RESOURCE_DIR.getPath().concat(path)));
            setDefaultEncoding(ENCODING);
            setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            setWrapUncheckedExceptions(true);
            setLogTemplateExceptions(false);
        }};
    }

    public static TemplateEngine folder(String path) throws IOException {
        return new TemplateEngine(path);
    }

    public void render(String template, HashMap<String, Object> data, HttpServletResponse resp) {
        resp.setCharacterEncoding(ENCODING);
        try (PrintWriter pw = resp.getWriter()) {
            config.getTemplate(template).process(data, pw);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }
}
