package com.vo;

public class Shop {
	private int shopid;
	private int sellerid;
	private String shopname;
	private String shopcreated;
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopcreated() {
		return shopcreated;
	}
	public void setShopcreated(String shopcreated) {
		this.shopcreated = shopcreated;
	}
	@Override
	public String toString() {
		return "shop [shopid=" + shopid + ", sellerid=" + sellerid + ", shopname=" + shopname + ", shopcreated="
				+ shopcreated + "]";
	}
	public Shop(int shopid, int sellerid, String shopname, String shopcreated) {
		super();
		this.shopid = shopid;
		this.sellerid = sellerid;
		this.shopname = shopname;
		this.shopcreated = shopcreated;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
