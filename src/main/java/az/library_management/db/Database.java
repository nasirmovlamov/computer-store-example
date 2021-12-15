package az.library_management.db;

import az.library_management.model.Accessor;
import az.library_management.model.Category;
import az.library_management.model.Purchase;
import az.library_management.model.User;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<User> findAllUser() {
        final String SQL_SELECT = "SELECT * FROM computer_store.users;";
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

    public List<Accessor> findAllAccessor() {
        final String SQL_SELECT = "SELECT * FROM computer_store.accessors;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Accessor> accessors = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int categoryId = resultSet.getInt("category_id");
                String modelNumber = resultSet.getString("model_number");
                String modelName = resultSet.getString("model_name");
                String description = resultSet.getString("description");
                BigDecimal price = BigDecimal.valueOf(resultSet.getFloat("price"));
                BigDecimal discount = BigDecimal.valueOf(resultSet.getFloat("discount"));
                accessors.add(
                        new Accessor(id, categoryId, modelNumber, modelName, description, price, discount)
                );
            }
            return accessors;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Category> findAllCategory() {
        final String SQL_SELECT = "SELECT * FROM computer_store.categories;";
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

    public List<Purchase> findAllPurchase() {
        final String SQL_SELECT = "SELECT * FROM computer_store.purchases;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Purchase> purchases = new ArrayList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                Integer userId = resultSet.getInt("user_id");
                Integer accessorId = resultSet.getInt("accessor_id");
                Integer quantity = resultSet.getInt("quantity");
                LocalDate orderDate = resultSet.getDate("order_date").toLocalDate();
                LocalTime orderTime = resultSet.getTime("order_time").toLocalTime();
                purchases.add(
                        new Purchase(id, userId, accessorId, quantity, orderDate, orderTime)
                );
            }
            return purchases;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }
}