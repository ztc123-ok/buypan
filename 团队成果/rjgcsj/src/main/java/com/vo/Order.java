package com.vo;

public class Order {
	private int orderid;
	private int waresid;
	private int buyerid;
	private int sellerid;
	private int waresnumber;
	private String ordertime;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getWaresid() {
		return waresid;
	}
	public void setWaresid(int waresid) {
		this.waresid = waresid;
	}
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public int getWaresnumber() {
		return waresnumber;
	}
	public void setWaresnumber(int waresnumber) {
		this.waresnumber = waresnumber;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", waresid=" + waresid + ", buyerid=" + buyerid + ", sellerid=" + sellerid
				+ ", waresnumber=" + waresnumber + ", ordertime=" + ordertime + "]";
	}
	public Order(int orderid, int waresid, int buyerid, int sellerid, int waresnumber, String ordertime) {
		super();
		this.orderid = orderid;
		this.waresid = waresid;
		this.buyerid = buyerid;
		this.sellerid = sellerid;
		this.waresnumber = waresnumber;
		this.ordertime = ordertime;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
