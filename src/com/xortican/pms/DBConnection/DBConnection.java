package com.xortican.pms.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException{
			Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","kamal");
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
		}
}

