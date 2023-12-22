package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection connect() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=HAMZA";
        String user = "sa";
        String password = "root";

        return DriverManager.getConnection(url, user, password);
    }
}
