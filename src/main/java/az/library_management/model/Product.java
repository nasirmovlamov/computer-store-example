package az.library_management.model;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal discount;
    private Integer categoryId;

    public Product() {
    }

    public Product(Integer id, String name, String description, BigDecimal price, BigDecimal discount, Integer categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', description='%s', price=%s, discount=%s, categoryId=%d}", id, name, description, price, discount, categoryId);
    }
}