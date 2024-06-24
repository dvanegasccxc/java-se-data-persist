import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        try (Connection cnx = dataBaseConnection.get_connection()) {
            System.out.println("Connection successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}