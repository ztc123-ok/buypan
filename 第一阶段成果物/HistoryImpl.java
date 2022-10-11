package com.impl;

import java.sql.SQLException;

import com.dao.HistoryDao;
import com.vo.historyorder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistoryImpl implements HistoryDao{
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	  
	  public static final String URL = "jdbc:mysql://localhost:3306/rgsj";
	  
	  public static final String USER = "root";
	  
	  public static final String PWD = "root";
	  
	  static {
		    try {
		      Class.forName("com.mysql.jdbc.Driver");
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    } 
		  }
	  
	  Connection getConnection() {
	    Connection conn = null;
	    try {
	      conn = DriverManager.getConnection(URL, USER, PWD);
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } 
	    return conn;
	  }
	  
	  
	  public List<historyorder> selecthistoryorder() throws SQLException {
		    Connection conn = getConnection();
		    String sql = "select * from historyorder";
		    PreparedStatement ps = conn.prepareStatement(sql);
		    ResultSet rs = ps.executeQuery();
		    List<historyorder> asd = new ArrayList<>();
		    historyorder order = null;
		    while (rs.next()) {
		      order = new historyorder();
		      order.setHistoryid(rs.getString(1));
		      order.setWaresid(rs.getString(2));
		      order.setShopid(rs.getString(3));
		      order.setBuyerid(rs.getString(4));
		      order.setWaresnumber(rs.getInt(5));
		      order.setFinishtime(rs.getString(6));
		      order.setBuyeraddress(rs.getString(7));
		      order.setBuyerphone(rs.getString(8));
		      asd.add(order);
		    } 
		    rs.close();
		    ps.close();
		    conn.close();
		    return asd;
		  }
	  
	  
	  
	  public void insertorder(historyorder or) throws SQLException{
		  
		  Connection conn = getConnection();
		    String sql = "insert into historyorder values(?,?,?,?,?,?,?,?)";
		    PreparedStatement ps = conn.prepareStatement(sql);
		    ps.setString(1, or.getHistoryid());
		    ps.setString(2, or.getWaresid());
		    ps.setString(3, or.getShopid());
		    ps.setString(4, or.getBuyerid());
		    ps.setInt(5, or.getWaresnumber());
		    ps.setString(6, or.getFinishtime());
		    ps.setString(7, or.getBuyeraddress());
		    ps.setString(8, or.getBuyerphone());
		    ps.execute();
		  
	  }
}
