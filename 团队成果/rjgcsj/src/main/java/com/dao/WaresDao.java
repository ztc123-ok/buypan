package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.vo.Wares;

public interface WaresDao {
	void insertwares(Wares w) throws SQLException;//录入商品信息
	List<Wares> selectwares() throws SQLException;//查询商品信息
	void updatezt(Wares w) throws SQLException;
}
