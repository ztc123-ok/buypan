package com.vo;

import java.util.Iterator;

public class Iscontent {
  public String sjdl(Iterator<Seller> it, Seller temple) {
    Seller qwe = null;
    String dl_result = "用户名或密码错误";
    while (it.hasNext()) {
      qwe = new Seller();
      qwe = it.next();
      String dd = String.valueOf(qwe.getSellerid());
      if (dd.equals(temple.getSellerid())) {
        if (qwe.getSellerpw().equals(temple.getSellerpw())) {
          dl_result = "登录成功";
          temple = qwe;
          continue;
        } 
        dl_result = "密码错误";
      } 
    } 
    return dl_result;
  }
  
  public String xgsjmm(Seller seller, String pwd1, String pwd2, String pwd3) {
    String xgsjmm_result = "修改成功";
    if (seller.getSellerpw().equals(pwd1)) {
      if (pwd2.length() < 6) {
        xgsjmm_result = "新密码长度过短";
      } else if (pwd2.length() > 12) {
        xgsjmm_result = "新密码长度过长";
      } else {
        int kinds = 0;
        for (int i = 0; i < pwd2.length(); i++) {
          if ('0' <= pwd2.charAt(i) && pwd2.charAt(i) <= '9') {
            kinds++;
            break;
          } 
        } 
        for (int i = 0; i < pwd2.length(); i++) {
          if ('a' <= pwd2.charAt(i) && pwd2.charAt(i) <= 'z') {
            kinds++;
            break;
          } 
          if ('A' <= pwd2.charAt(i) && pwd2.charAt(i) <= 'Z') {
            kinds++;
            break;
          } 
        } 
        if (kinds < 2) {
          xgsjmm_result = "新密码类型单一";
        } else {
        	if (!pwd2.equals(pwd3)) {
        		xgsjmm_result = "确认密码错误";
        	} 
        }
      } 
    } else {
      xgsjmm_result = "旧密码错误";
    } 
    return xgsjmm_result;
  }
}
