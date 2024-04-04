package com.javaex.vo;

public class OrderItemVo {

	private int f_r_no;
	private int f_no;
	private int f_count;
	
	public OrderItemVo() {
		super();
	}

	public int getF_r_no() {
		return f_r_no;
	}

	public void setF_r_no(int f_r_no) {
		this.f_r_no = f_r_no;
	}

	public int getF_no() {
		return f_no;
	}

	public void setF_no(int f_no) {
		this.f_no = f_no;
	}

	public int getF_count() {
		return f_count;
	}

	public void setF_count(int f_count) {
		this.f_count = f_count;
	}

	@Override
	public String toString() {
		return "OrderItemVo [f_r_no=" + f_r_no + ", f_no=" + f_no + ", f_count=" + f_count + "]";
	}

	

	
}