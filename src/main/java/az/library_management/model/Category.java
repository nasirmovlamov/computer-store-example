package az.library_management.model;

public class Category {
    private Integer categoryId;
    private String bookCategory;

    public Category() {
    }

    public Category(Integer categoryId, String bookCategory) {
        this.categoryId = categoryId;
        this.bookCategory = bookCategory;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String toString() {
        return String.format("Category{categoryId=%d, bookCategory='%s'}", categoryId, bookCategory);
    }
}
