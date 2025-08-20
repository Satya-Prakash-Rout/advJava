import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Satya {
    public static void main(String[] args) {
        // JDBC URL without database name
        String url = "jdbc:mysql://localhost:3306/?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "satya1"; // Replace with your MySQL username
        String password = "satya@2005"; // Replace with your MySQL password

        String dbName = "newdb"; // The database you want to create

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE DATABASE " + dbName;
            stmt.executeUpdate(sql);

            System.out.println("Database '" + dbName + "' created successfully.");

        } catch (SQLException e) {
            System.out.println("Error while creating database:");
            e.printStackTrace();
        }
    }
}
