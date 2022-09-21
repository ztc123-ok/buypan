package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.vo.Order;

public interface OrderDao {
	void insertorder(Order o) throws SQLException;//录入记录信息
	List<Order> selectorder() throws SQLException;//查询记录信息
}
