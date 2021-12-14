package az.library_management.db;

import az.library_management.model.Category;
import az.library_management.model.Order;
import az.library_management.model.Product;
import az.library_management.model.User;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<User> findAllUser() {
        final String SQL_SELECT = "SELECT * FROM ecommerce.users;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                users.add(
                        new User(id, username, password, firstName, lastName, address, phone)
                );
            }
            return users;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Product> findAllProduct() {
        final String SQL_SELECT = "SELECT * FROM ecommerce.products;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Product> products = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                BigDecimal price = BigDecimal.valueOf(resultSet.getDouble("price"));
                BigDecimal discount = BigDecimal.valueOf(resultSet.getDouble("discount"));
                int categoryId = resultSet.getInt("categoryId");
                products.add(
                        new Product(id, name, description, price, discount, categoryId)
                );
            }
            return products;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Category> findAllCategory() {
        final String SQL_SELECT = "SELECT * FROM ecommerce.categories;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Category> categories = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                categories.add(
                        new Category(id, name)
                );
            }
            return categories;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Order> findAllOrder() {
        final String SQL_SELECT = "SELECT * FROM ecommerce.orders;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Order> orders = new ArrayList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                Integer userId = resultSet.getInt("userId");
                Integer productId = resultSet.getInt("productId");
                Integer quantity = resultSet.getInt("quantity");
                LocalDate orderDate = resultSet.getDate("order_date").toLocalDate();
                LocalTime orderTime = resultSet.getTime("order_time").toLocalTime();
                orders.add(
                        new Order(id, userId, productId, quantity, orderDate, orderTime)
                );
            }
            return orders;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }
}