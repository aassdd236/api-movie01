package com.javaex.vo;

import java.util.List;

public class OrderVo {
	
	private int f_r_no;
	private String phoneNumber;
	private List<OrderItemVo> orderItemList;
	private int user_point;
	
	public OrderVo() {
		super();
	}
	
	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public int getF_r_no() {
		return f_r_no;
	}

	public void setF_r_no(int f_r_no) {
		this.f_r_no = f_r_no;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<OrderItemVo> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItemVo> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "OrderVo [f_r_no=" + f_r_no + ", phoneNumber=" + phoneNumber + ", orderItemList=" + orderItemList
				+ ", user_point=" + user_point + "]";
	}

}
