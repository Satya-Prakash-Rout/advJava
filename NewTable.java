
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewTable {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/newdb";
        String user = "root"; // change this to your MySQL user
        String password = "2005"; // change this to your MySQL password

        // SQL statement to create a table
        String sql = "CREATE TABLE users1 ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "username VARCHAR(50) NOT NULL, "
                   + "email VARCHAR(100), "
                   + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                   + ")";

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Execute SQL
            stmt.executeUpdate(sql);
            System.out.println("Table 'users' created successfully in database 'newdb'.");

            // Close connection
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
