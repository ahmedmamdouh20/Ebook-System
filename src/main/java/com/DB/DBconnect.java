package com.DB;
import java.sql.*;  

public class DBconnect {
	private static Connection conn;
	public static Connection getConn(){
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook_system?useSSL=false","root","1192@#db"); 
	}catch(Exception e) {
		e.printStackTrace();
	}
	return conn;
  }

}
