package com.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dao.WaresDao;
import com.vo.Wares;
public class WaresImpl implements WaresDao{
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
	public void insertwares(Wares w) throws SQLException {
		Connection conn =getConnection();
		String sql = "insert into wares(waresid,waresname,waresprice,waresnumber,shopid,waresstate,warespicture,waresclass,matketing) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, w.getWaresid());
		ps.setString(2, w.getWaresname());
		ps.setBigDecimal(3, w.getWaresprice());
		ps.setInt(4, w.getWaresnumber());
		ps.setInt(5, w.getShopid());
		ps.setString(6, w.getWaresstate());
		ps.setString(7, w.getWarespicture());
		ps.setString(8, w.getWaresclass());
		ps.setString(9, w.getMatkering());
		ps.execute();
		ps.close();
		conn.close();
	}
	@Override
	public List<Wares> selectwares() throws SQLException {
		Connection conn =getConnection();
		String sql="select * from wares";		
		Statement stat=conn.createStatement();
		ResultSet rs=stat.executeQuery(sql);
		List<Wares> asd=new ArrayList<Wares>();	
		Wares wares=null;
		while(rs.next()){
			wares=new Wares();
			wares.setWaresid(rs.getInt(1));	
			wares.setWaresname(rs.getString(2));
			wares.setWaresprice(rs.getBigDecimal(3));
			wares.setWaresnumber(rs.getInt(4));
			wares.setShopid(rs.getInt(5));
			wares.setWaresstate(rs.getString(6));
			wares.setWarespicture(rs.getString(7));
			wares.setWaresclass(rs.getString(8));
			wares.setMatkering(rs.getString(9));
			wares.setOldprice(rs.getBigDecimal(10));
			asd.add(wares);
			}
		rs.close();
		stat.close();
		conn.close();
		return asd;
	}
	
	@Override
	public void updatezt(Wares w) throws SQLException{
		Connection conn =getConnection();
		String sql = "update wares set waresstate=? where waresid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(2, w.getWaresid());
		ps.setString(1, w.getWaresstate());
		ps.execute();
		
		
	}

}
