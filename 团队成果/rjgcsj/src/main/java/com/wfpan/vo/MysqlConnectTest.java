package com.wfpan.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectTest {
	private static String url = "jdbc:mysql://localhost:3306/shoponline"; 
	private static String userName = "root";
	private static String password = "a1158189673";
	public Connection getConnection(){
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return con;
		}
}
