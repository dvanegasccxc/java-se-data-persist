import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public Connection get_connection() {
        String user = "root";
        String password = "root";
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        }

        System.out.println("MySQL JDBC Driver Registered");


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if(connection != null) {
            System.out.println("You are now successfully connected to SQL database!");
        } else {
            System.out.println("Failed to make connection!");

        }
        return connection;
    };
}
