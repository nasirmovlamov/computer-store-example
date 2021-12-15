package az.library_management.model;

import java.math.BigDecimal;

public class Accessor {
    private Integer id;
    private Integer categoryId;
    private String modelNumber;
    private String modelName;
    private String description;
    private BigDecimal price;
    private BigDecimal discount;

    public Accessor() {
    }

    public Accessor(Integer id, Integer categoryId, String modelNumber, String modelName, String description, BigDecimal price, BigDecimal discount) {
        this.id = id;
        this.categoryId = categoryId;
        this.modelNumber = modelNumber;
        this.modelName = modelName;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    @Override
    public String toString() {
        return String.format("Accessor{id=%d, category_id=%d, modelNumber='%s', modelName='%s', description='%s', price=%s, discount=%s}", id, categoryId, modelNumber, modelName, description, price, discount);
    }
}