package az.library_management.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection getDbConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "password");
        } catch (SQLException e) {
            System.out.println("Cannot connect to db");
        } finally {
            if (connection != null) connection.close();
        }
        return connection;
    }
}
