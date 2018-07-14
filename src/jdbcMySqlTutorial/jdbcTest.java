package jdbcMySqlTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {
	
	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		
		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
			
			System.out.println("Database connection successful!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
