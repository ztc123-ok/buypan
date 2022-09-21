package com.vo;

import java.math.BigDecimal;

public class Wares {
	private int waresid;
	private String waresname;
	private BigDecimal waresprice;
	private int waresnumber;
	private int shopid;
	private String waresstate;
	private String warespicture;
	private String waresclass;
	private String matkering;
	private BigDecimal oldprice;
	public int getWaresid() {
		return waresid;
	}
	public void setWaresid(int waresid) {
		this.waresid = waresid;
	}
	public String getWaresname() {
		return waresname;
	}
	public void setWaresname(String waresname) {
		this.waresname = waresname;
	}
	public BigDecimal getWaresprice() {
		return waresprice;
	}
	public void setWaresprice(BigDecimal waresprice) {
		this.waresprice = waresprice;
	}
	public int getWaresnumber() {
		return waresnumber;
	}
	public void setWaresnumber(int waresnumber) {
		this.waresnumber = waresnumber;
	}
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getWaresstate() {
		return waresstate;
	}
	public void setWaresstate(String waresstate) {
		this.waresstate = waresstate;
	}
	public String getWarespicture() {
		return warespicture;
	}
	public void setWarespicture(String warespicture) {
		this.warespicture = warespicture;
	}
	public String getWaresclass() {
		return waresclass;
	}
	public void setWaresclass(String waresclass) {
		this.waresclass = waresclass;
	}
	public String getMatkering() {
		return matkering;
	}
	public void setMatkering(String matkering) {
		this.matkering = matkering;
	}
	public BigDecimal getOldprice() {
		return oldprice;
	}
	public void setOldprice(BigDecimal oldprice) {
		this.oldprice = oldprice;
	}
	@Override
	public String toString() {
		return "wares [waresid=" + waresid + ", waresname=" + waresname + ", waresprice=" + waresprice
				+ ", waresnumber=" + waresnumber + ", shopid=" + shopid + ", waresstate=" + waresstate
				+ ", warespicture=" + warespicture + ", waresclass=" + waresclass + ", matkering=" + matkering
				+ ", oldprice=" + oldprice + "]";
	}
	public Wares(int waresid, String waresname, BigDecimal waresprice, int waresnumber, int shopid, String waresstate,
			String warespicture, String waresclass, String matkering, BigDecimal oldprice) {
		super();
		this.waresid = waresid;
		this.waresname = waresname;
		this.waresprice = waresprice;
		this.waresnumber = waresnumber;
		this.shopid = shopid;
		this.waresstate = waresstate;
		this.warespicture = warespicture;
		this.waresclass = waresclass;
		this.matkering = matkering;
		this.oldprice = oldprice;
	}
	public Wares() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
