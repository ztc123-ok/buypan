package com.wfpan.vo;

import java.sql.Connection;
public class lianjie {
	public static void main(String[] args) {
		MysqlConnectTest mysql= new MysqlConnectTest();
		Connection con = mysql.getConnection();
		if(con==null){    
		            System.out.println("与mysql数据库连接失败！");    
		        }else{    
		            System.out.println("与mysql数据库连接成功！");    
		        }
		}
}
