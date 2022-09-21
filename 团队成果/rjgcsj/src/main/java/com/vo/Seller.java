package com.vo;

public class Seller {
	private String sellername;
	private int sellerid;
	private String sellerpw;
	private String sellerphone;
	private int shopid;
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public String getSellerpw() {
		return sellerpw;
	}
	public void setSellerpw(String sellerpw) {
		this.sellerpw = sellerpw;
	}
	public String getSellerphone() {
		return sellerphone;
	}
	public void setSellerphone(String sellerphone) {
		this.sellerphone = sellerphone;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public Seller(String sellername, int sellerid, String sellerpw, String sellerphone, int shopid) {
		super();
		this.sellername = sellername;
		this.sellerid = sellerid;
		this.sellerpw = sellerpw;
		this.sellerphone = sellerphone;
		this.shopid = shopid;
	}
	@Override
	public String toString() {
		return "Seller [sellername=" + sellername + ", sellerid=" + sellerid + ", sellerpw=" + sellerpw
				+ ", sellerphone=" + sellerphone + ", shopid=" + shopid + "]";
	}
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
