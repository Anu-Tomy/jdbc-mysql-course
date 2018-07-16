package jdbcMySqlTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTableWithYahoo {

	public static Connection getConnection() throws Exception {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	    String username = "student";
	    String password = "student";
	    Class.forName(driver);
	    Connection conn = DriverManager.getConnection(url, username, password);
	    return conn;
	  }

	  public static void main(String[] args) throws Exception{
	    PreparedStatement pstmt = null;
	    Connection conn = null;
	    try {
	      StringBuffer sql = new StringBuffer("CREATE TABLE tableWithAllTypesTestPass(");
	      sql.append("rowNumber            INTEGER, ");              
	      sql.append("symbol               VARCHAR(254), ");        // String
	      sql.append("name	               VARCHAR(254), ");
	      sql.append("price			       DOUBLE PRECISION, ");    // Double
	      sql.append("percentChange        VARCHAR(254), ");		// String
	      sql.append("avgVolume            VARCHAR(254), ");       
	      sql.append("marketCap			   DOUBLE PRECISION)");    // Double
	      
	      conn = getConnection();
	      pstmt = conn.prepareStatement(sql.toString());
	      pstmt.executeUpdate();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      conn.close();
	    }
	  }
}

