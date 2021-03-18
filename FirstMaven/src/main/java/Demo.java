import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnection();
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String DB_URL = "jdbc:mysql://localhost/airlineht";
		String USER_NAME = "root";
		String PASSWORD = "Tphuy150200mysql@";

		System.out.println("Driver loading");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection cnn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		System.out.println("Connected");
		return cnn;
	}
}
