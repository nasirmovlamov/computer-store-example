package az.library_management.model;

public class Stock {
    private Integer stockId;
    private Integer bookId;
    private String stock;

    public Stock() {
    }

    public Stock(Integer stockId, Integer bookId, String stock) {
        this.stockId = stockId;
        this.bookId = bookId;
        this.stock = stock;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", bookId=" + bookId +
                ", stock='" + stock + '\'' +
                '}';
    }
}