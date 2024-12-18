package testNGPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	public static void main(String[] args) {
        // Replace with your test server details
        String url = "jdbc:postgresql://10.125.242.65:5433/adminboundary";
        String user = "gisadmin";
        String password = "gisadmin";
        Connection connection = null;

        try {
            // 1. Connect to the test server
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the test server!");

            // 2. Execute a query to fetch data
            Statement statement = connection.createStatement();
            String query = "select * from vw_userregistration limit 100"; // Replace with your table name
            ResultSet resultSet = statement.executeQuery(query);

            // 3. Process the result set
            while (resultSet.next()) {
                // Replace with your column names and types
                String loginid = resultSet.getString("loginid");
                String passwd = resultSet.getString("pwd");
        

                System.out.println("ID: " + loginid + ", Name: " + passwd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
