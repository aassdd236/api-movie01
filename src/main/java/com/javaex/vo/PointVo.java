package com.javaex.vo;

public class PointVo {

	private int user_no;
	private String user_hp;
	private String user_birth;
	private int user_point;
	
	private int f_r_no;
	private int f_p_no;
	
	private String f_name;
	private int f_price;
	
	public PointVo() {
		super();
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_hp() {
		return user_hp;
	}

	public void setUser_hp(String user_hp) {
		this.user_hp = user_hp;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
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

	public int getF_p_no() {
		return f_p_no;
	}

	public void setF_p_no(int f_p_no) {
		this.f_p_no = f_p_no;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public int getF_price() {
		return f_price;
	}

	public void setF_price(int f_price) {
		this.f_price = f_price;
	}

	@Override
	public String toString() {
		return "PointVo [user_no=" + user_no + ", user_hp=" + user_hp + ", user_birth=" + user_birth + ", user_point="
				+ user_point + ", f_r_no=" + f_r_no + ", f_p_no=" + f_p_no + ", f_name=" + f_name + ", f_price="
				+ f_price + "]";
	}
	
	
}
