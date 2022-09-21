package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.SellerDao;
import com.vo.Seller;


public class SellerImpl implements SellerDao{
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
	public void insertseller(Seller s) throws SQLException {
		Connection conn =getConnection();
		String sql = "insert into seller(sellername,sellerid,sellerpw,sellerphone) values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, s.getSellername());
		ps.setInt(2, s.getSellerid());
		ps.setString(3, s.getSellerpw());
		ps.setString(4, s.getSellerphone());
		ps.execute();
	}

	@Override
	public Seller updateseller(Seller s) throws SQLException {
		Connection conn =getConnection();
		String sql = "update seller set sellerphone=? where sellerid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		//ps.setInt(1, s.getSellerphone());
		ps.execute();
		return null;
	}

	@Override
	public void updatesellerpw(Seller s) throws SQLException {
		Connection conn =getConnection();
		String sql = "update seller set sellerpw=? where sellerpw=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(2, s.getSellerphone());
		ps.setString(1, s.getSellerpw());
		ps.execute();
		
	}
	@Override
	public Seller sellerlogin(Seller s) throws SQLException {
		Connection conn =getConnection();
		String sql="select sellerid,sellerpw from seller";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, s.getSellerid());
		ps.setString(2, s.getSellerpw());
		ResultSet rs=ps.executeQuery();
		Seller seller=null;
		if(rs.next()) {
			seller=new Seller();
			seller.setSellername(rs.getString(1));
		}
		return seller;
	}
	@Override
	public List<Seller> selectsellerpw() throws SQLException {
		String sql="select * from seller";
		
		Connection conn =getConnection();
		Statement stat=conn.createStatement();
		ResultSet rs=stat.executeQuery(sql);
		List<Seller> asd=new ArrayList<Seller>();
		
			
		
		
		Seller seller=null;
		while(rs.next()){
			seller=new Seller();
			seller.setSellername(rs.getString(1));	
			seller.setSellerid(rs.getInt(2));
			seller.setSellerpw(rs.getString(3));
			seller.setSellerphone(rs.getString(4));
			seller.setShopid(rs.getInt(5));
			asd.add(seller);
			}
		rs.close();
		stat.close();
		conn.close();
		return asd;
		

	}

}
