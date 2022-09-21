package com.dao;

import java.sql.SQLException;

import com.vo.Buyer;

public interface BuyerDao {
	Buyer insertbuyer(Buyer b) throws SQLException;//创建买家账号
	void updatebuyer(Buyer b) throws SQLException;//添加买家补充信息
}
