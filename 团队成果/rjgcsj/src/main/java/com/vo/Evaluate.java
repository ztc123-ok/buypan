package com.vo;

public class Evaluate {
	private int evaluateid;
	private int waresid;
	private int buyerid;
	private String evaluatecontent;
	private String evaluatetime;
	public int getEvaluateid() {
		return evaluateid;
	}
	public void setEvaluateid(int evaluateid) {
		this.evaluateid = evaluateid;
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
	public String getEvaluatecontent() {
		return evaluatecontent;
	}
	public void setEvaluatecontent(String evaluatecontent) {
		this.evaluatecontent = evaluatecontent;
	}
	public String getEvaluatetime() {
		return evaluatetime;
	}
	public void setEvaluatetime(String evaluatetime) {
		this.evaluatetime = evaluatetime;
	}
	@Override
	public String toString() {
		return "Evaluate [evaluateid=" + evaluateid + ", waresid=" + waresid + ", buyerid=" + buyerid
				+ ", evaluatecontent=" + evaluatecontent + ", evaluatetime=" + evaluatetime + "]";
	}
	public Evaluate(int evaluateid, int waresid, int buyerid, String evaluatecontent, String evaluatetime) {
		super();
		this.evaluateid = evaluateid;
		this.waresid = waresid;
		this.buyerid = buyerid;
		this.evaluatecontent = evaluatecontent;
		this.evaluatetime = evaluatetime;
	}
	public Evaluate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
