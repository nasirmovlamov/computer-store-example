package az.library_management.template_engine;

public enum Directory {
    RESOURCE_DIR("src/main/resources/"),
    TEMPLATE_DIR("src/main/resources/templates/");
//    CSS_DIR("src/main/resources/"),
//    JS_DIR("src/main/resources/"),
//    IMAGE_DIR("src/main/resources/");

    private final String path;

    Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
