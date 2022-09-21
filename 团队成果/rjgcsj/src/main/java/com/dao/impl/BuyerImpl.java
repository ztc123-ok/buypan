package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.BuyerDao;
import com.vo.Buyer;

public class BuyerImpl implements BuyerDao{
	public static final String DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/rgsj";
	public static final String USER="root";
	public static final String PWD="123456";
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	Connection getConnection() {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	@Override
	public Buyer insertbuyer(Buyer b) throws SQLException {
		Connection conn =getConnection();
		String sql = "insert into buyer(buyername,buyerid,buyerpw) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, b.getBuyername());
		ps.setInt(2, b.getBuyerid());
		ps.setString(3, b.getBuyerpw());
		ps.execute();
		return null;
	}
	@Override
	public void updatebuyer(Buyer b) throws SQLException {
		Connection conn =getConnection();
		String sql = "update buyer set buyeraddress=?,buyerphone=? where buyerid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, b.getBuyeraddress());
		ps.setString(2, b.getBuyerphone());
		ps.setInt(3,b.getBuyerid());
		ps.execute();
	}
}
