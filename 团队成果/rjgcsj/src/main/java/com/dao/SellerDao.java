package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.vo.Seller;

public interface SellerDao{
	void insertseller(Seller s) throws SQLException;//创建商家账号
	Seller updateseller(Seller s) throws SQLException;//添加商家具体信息
	void updatesellerpw(Seller s)throws SQLException;//更改商家密码
	Seller sellerlogin(Seller s) throws SQLException;//商家登录
	List<Seller> selectsellerpw() throws SQLException;
	//Seller selectsellerpw(Seller s) throws SQLException;//查询商家密码
}
