package com.javaex.vo;

public class MovieVo {
	
	private int m_no;
	private String m_name;
	private int m_price;
	private String filePath;
	private String orgName;
	private String saveName;
	private long fileSize;
	private String m_remarks;
	private int m_count;
	
	
	
	public MovieVo() {
		super();
	}
	public MovieVo(String filePath, String orgName, String saveName, long fileSize) {
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}
	public MovieVo(int m_no, String m_name, int m_price, String filePath, String orgName, String saveName,
			long fileSize, String m_remarks, int m_count) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_price = m_price;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
		this.m_remarks = m_remarks;
		this.m_count = m_count;
	}
	public int getM_count() {
		return m_count;
	}
	public void setM_count(int m_count) {
		this.m_count = m_count;
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
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSaveName() {
		return saveName;
	}
	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getM_remarks() {
		return m_remarks;
	}
	public void setM_remarks(String m_remarks) {
		this.m_remarks = m_remarks;
	}
	@Override
	public String toString() {
		return "MovieVo [m_no=" + m_no + ", m_name=" + m_name + ", m_price=" + m_price + ", filePath=" + filePath
				+ ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize=" + fileSize + ", m_remarks="
				+ m_remarks + ", m_count=" + m_count + "]";
	}
	
	
	
	
}
