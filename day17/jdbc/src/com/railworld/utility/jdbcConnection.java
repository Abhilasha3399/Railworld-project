package com.railworld.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection {
	public static Connection getconnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		Connection con=null;
		try {
			
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbatch2", "root", "test");
			System.out.println("sucess");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
		
	}

}
