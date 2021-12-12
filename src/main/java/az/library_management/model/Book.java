package az.library_management.model;

public class Book {
    private Integer bookId;
    private Integer bookSerialNum;
    private String bookName;
    private String authorName;
    private String bookEdition;
    private Integer categoryId;

    public Book() {
    }

    public Book(Integer bookId, Integer bookSerialNum, String bookName, String authorName, String bookEdition, Integer categoryId) {
        this.bookId = bookId;
        this.bookSerialNum = bookSerialNum;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookEdition = bookEdition;
        this.categoryId = categoryId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookSerialNum() {
        return bookSerialNum;
    }

    public void setBookSerialNum(Integer bookSerialNum) {
        this.bookSerialNum = bookSerialNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return String.format("Book{bookId=%d, bookSerialNum=%d, bookName='%s', authorName='%s', bookEdition='%s', categoryId=%d}", bookId, bookSerialNum, bookName, authorName, bookEdition, categoryId);
    }
}