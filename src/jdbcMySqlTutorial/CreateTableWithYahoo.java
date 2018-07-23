package jdbcMySqlTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreateTableWithYahoo {

	public static Connection getConnection() throws Exception {
	    String url = "jdbc:mysql://localhost:3306/yahoo_finance_scraper?useSSL=false";
	    String username = "yahoo";
	    String password = "yahoo";
	    Connection conn = DriverManager.getConnection(url, username, password);
	    System.out.println("Database connection successful!");
	    return conn;
	  }

	  public static void main(String[] args) throws Exception{
		  PreparedStatement pstmt = null;	//preparedStatement object
		  Connection conn = null;	       //connection object
		  ResultSet rs = null;	           // result set object
	    try {
	      StringBuffer sql = new StringBuffer("CREATE TABLE stocksTableTest(");
	      sql.append("rowNumber			INTEGER, ");
	      sql.append("symbol			VARCHAR(6), ");
	      sql.append("name				VARCHAR(25), ");
	      sql.append("price				DOUBLE PRECISION, ");
	      sql.append("chang				DECIMAL(3,2), ");
	      sql.append("percentChang			DECIMAL(3,3), ");
	      sql.append("volum				VARCHAR(12), ");    
	      sql.append("avgVol			VARCHAR(10), ");
	      sql.append("marketCap			DOUBLE PRECISION, ");
	      sql.append("peRatio			VARCHAR(10), "); 
	      sql.append("fiftTwoWkRange		DOUBLE PRECISION)");

	      
	      conn = getConnection();
	      pstmt = conn.prepareStatement(sql.toString());
	      pstmt.executeUpdate();
	      System.out.println("The Stocks table is created");
	      
	    //insert records into stocks table
	      pstmt.executeUpdate("INSERT INTO  stocksTableTest VALUES('1','FB', 'Facebook', '210.0100','+1.1200','+0.55', '8.712', '19.39','610.913','34.94','211.50')");
	     
	      
	   // get all of the the records from the stocks table
	      rs = pstmt.executeQuery("SELECT * FROM stocksTableTest");
	     
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	    	rs.close();
	    	pstmt.close();
	    	conn.close();
	    }
	  }
}

