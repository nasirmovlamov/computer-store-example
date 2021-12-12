package az.library_management.db;

import az.library_management.model.Book;
import az.library_management.model.Category;
import az.library_management.model.Stock;
import az.library_management.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Users> findAllUser() {
        final String SQL_SELECT = "SELECT * FROM library.users;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Users> users = new ArrayList<>();
            while (resultSet.next()) {
                int userId = resultSet.getInt("User_Id");
                int roleId = resultSet.getInt("Roles_ID");
                int year = resultSet.getInt("Year");
                String name = resultSet.getString("Name");
                String degreeProgram = resultSet.getString("Degree_Program");
                String contact = resultSet.getString("Contact");
                String address = resultSet.getString("Address");
                users.add(
                        new Users(userId, roleId, name, degreeProgram, contact, address, year)
                );
            }
            return users;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Book> findAllBook() {
        final String SQL_SELECT = "SELECT * FROM library.books;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Book> books = new ArrayList<>();
            while (resultSet.next()) {
                int bookId = resultSet.getInt("Book_Id");
                int bookSerialNum = resultSet.getInt("Book_Serial_Num");
                int categoryId = resultSet.getInt("category_id");
                String bookName = resultSet.getString("Book_Name");
                String authorName = resultSet.getString("Author_Name");
                String bookEdition = resultSet.getString("Book_Edition");
                books.add(
                        new Book(bookId, bookSerialNum, bookName, authorName, bookEdition, categoryId)
                );
            }
            return books;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Category> findAllCategory() {
        final String SQL_SELECT = "SELECT * FROM library.category;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Category> categories = new ArrayList<>();
            while (resultSet.next()) {
                int categoryId = resultSet.getInt("category_Id");
                String bookCategory = resultSet.getString("Book_Category");
                categories.add(
                        new Category(categoryId, bookCategory)
                );
            }
            return categories;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }

    public List<Stock> findAllStocks() {
        final String SQL_SELECT = "SELECT * FROM library.stocks;";
        try (Connection conn = new DbConnection().getDbConnection();
             PreparedStatement sql = conn.prepareStatement(SQL_SELECT)) {
            ResultSet resultSet = sql.executeQuery();
            List<Stock> stocks = new ArrayList<>();
            while (resultSet.next()) {
                int bookId = resultSet.getInt("Book_Id");
                int stockId = resultSet.getInt("StockId");
                String stock = resultSet.getString("Stock");
                stocks.add(
                        new Stock(stockId, bookId, stock)
                );
            }
            return stocks;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Error while interacting with db");
        }
        return new ArrayList<>();
    }
}