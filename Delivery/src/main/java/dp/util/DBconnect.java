package dp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
	

	//create database connection object
	private static Connection con;
	
	// This works according to singleton pattern
		private DBconnect() {}
	
	//get DB connectivity
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		//validate database connection in a try catch block
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//getting connection
			con = DriverManager.getConnection(CommonConstants.URL, CommonConstants.USERNAME, CommonConstants.PASSWORD);
			
		}
		catch (Exception e) {
			System.out.println("Database connection is unsuccessful!");
		}
		
		return con;
	}

}