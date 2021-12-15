package az.library_management.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Purchase {
    private Integer id;
    private Integer userId;
    private Integer accessorId;
    private Integer quantity;
    private LocalDate orderDate;
    private LocalTime orderTime;

    public Purchase() {
    }

    public Purchase(Integer id, Integer userId, Integer accessorId, Integer quantity, LocalDate orderDate, LocalTime orderTime) {
        this.id = id;
        this.userId = userId;
        this.accessorId = accessorId;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccessorId() {
        return accessorId;
    }

    public void setAccessorId(Integer accessorId) {
        this.accessorId = accessorId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + accessorId +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                '}';
    }
}