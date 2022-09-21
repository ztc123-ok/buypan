package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.OrderDao;
import com.vo.Order;
import com.vo.Wares;

public class OrderImpl implements OrderDao{
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
	public void insertorder(Order o) throws SQLException {
		Connection conn =getConnection();
		String sql = "insert into orderr(waresid,buyerid,waresnumber,ordertime) values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, o.getWaresid());
		ps.setInt(2, o.getBuyerid());
		ps.setInt(3, o.getWaresnumber());
		ps.setString(4, o.getOrdertime());
		ps.execute();
	}

	@Override
	public List<Order> selectorder() throws SQLException {
		Connection conn =getConnection();
		String sql="select * from orderr";
		PreparedStatement ps=conn.prepareStatement(sql);

		ResultSet rs=ps.executeQuery();
		
		List<Order> asd=new ArrayList<Order>();
		
		
		Order order=null;
		while(rs.next()) {
			order=new Order();
			order.setOrderid(rs.getInt(1));	
			order.setWaresid(rs.getInt(2));
			order.setBuyerid(rs.getInt(3));
			order.setWaresnumber(rs.getInt(4));
			order.setOrdertime(rs.getString(5));
			asd.add(order);
			}
		rs.close();
		ps.close();
		conn.close();
		return asd;
	}

}
