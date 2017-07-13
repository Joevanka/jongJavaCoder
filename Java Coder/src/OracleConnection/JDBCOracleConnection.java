package OracleConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCOracleConnection {

	public static void main(String[] args) {
		System.out.println("----------Oracle Connection----------");
		try {
			// register oracle driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException ex) {
			System.out.println("Oracle Driver not found");
			ex.printStackTrace();
			return;
		}

		System.out.println("Oracle Driver has been successfully added");

		// create object connection
		Connection conn = null;

		try {
			// make connection with oracle database
			// parameter : url , user name , password
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (SQLException ex) {
			System.out.println("Connection Failed !!");
			ex.printStackTrace();
			return;
		}

		System.out.println("Successfully to connect oracle database");

	}
}
