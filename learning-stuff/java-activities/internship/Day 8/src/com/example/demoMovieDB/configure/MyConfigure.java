package com.example.demoMovieDB.configure;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfigure {
	static final String url = "jdbc:mysql://localhost/dpsjava";
	static final String user = "root";
	static final String password = "1234";
	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
	}
}
