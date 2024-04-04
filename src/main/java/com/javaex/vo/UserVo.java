package com.javaex.vo;

public class UserVo {

	// 필드
	// 유저테이블(user_table)
	private int user_no;//유저회원번호
	private int user_point;//유저회원번호
	private String user_hp; //유저핸드폰번호 
	private String user_name; //유저이름

	// 영화테이블 (movie_table)
	private int m_no; //영화번호 (상영테이블 조인)
	private String m_name; //영화이름
	private int m_price; //영화가격


	// 상영테이블(screening_table)
	private int s_no; //상영번호 (영화영수증테이블조인)
	private String s_date; //상영시간
	
	// 영화영수증테이블(movie_receipt)
	private String m_r_date; //영화상영날짜
	private int m_r_no; //영화영수증번호
	
	//영화구매내역
	private int m_p_no;//영화구매번호
	private String m_s_no;//좌석번호
	
	public UserVo() {

	}
	
	
	public UserVo(int user_no, String user_hp, String user_name, int m_no, String m_name, int m_price, int s_no,
			String s_date, String m_r_date, int m_r_no, int m_p_no, String m_s_no, int user_point) {
		super();
		this.user_no = user_no;
		this.user_hp = user_hp;
		this.user_name = user_name;
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_price = m_price;
		this.s_no = s_no;
		this.s_date = s_date;
		this.m_r_date = m_r_date;
		this.m_r_no = m_r_no;
		this.m_p_no = m_p_no;
		this.m_s_no = m_s_no;
		this.user_point = user_point;
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


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public int getM_no() {
		return m_no;
	}


	public void setM_no(int m_no) {
		this.m_no = m_no;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public int getM_price() {
		return m_price;
	}


	public void setM_price(int m_price) {
		this.m_price = m_price;
	}


	public int getS_no() {
		return s_no;
	}


	public void setS_no(int s_no) {
		this.s_no = s_no;
	}


	public String getS_date() {
		return s_date;
	}


	public void setS_date(String s_date) {
		this.s_date = s_date;
	}


	public String getM_r_date() {
		return m_r_date;
	}


	public void setM_r_date(String m_r_date) {
		this.m_r_date = m_r_date;
	}


	public int getM_r_no() {
		return m_r_no;
	}


	public void setM_r_no(int m_r_no) {
		this.m_r_no = m_r_no;
	}


	public int getM_p_no() {
		return m_p_no;
	}


	public void setM_p_no(int m_p_no) {
		this.m_p_no = m_p_no;
	}


	public String getM_s_no() {
		return m_s_no;
	}


	public void setM_s_no(String m_s_no) {
		this.m_s_no = m_s_no;
	}
	
	public int getuser_point() {
		return user_point;
	}


	public void setM_s_no(int user_point) {
		this.user_point = user_point;
	}


	@Override
	public String toString() {
		return "UserVo [user_no=" + user_no + ", user_hp=" + user_hp + ", user_name=" + user_name + ", m_no=" + m_no
				+ ", m_name=" + m_name + ", m_price=" + m_price + ", s_no=" + s_no + ", s_date=" + s_date
				+ ", m_r_date=" + m_r_date + ", m_r_no=" + m_r_no + ", m_p_no=" + m_p_no + ", m_s_no=" + m_s_no +", user_point=" + user_point + "]";
	}

	
	
	
	
}