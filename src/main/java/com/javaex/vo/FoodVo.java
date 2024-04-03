package com.javaex.vo;

public class FoodVo {

	private int f_no;
	private String f_name;
	private int f_price;
	private String filePath;
	private String orgName;
	private String saveName;
	private long fileSize;
	private String f_remarks;

	public FoodVo() {
		super();
	}

	
	public FoodVo(String filePath, String orgName, String saveName, long fileSize) {
		super();
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}


	public FoodVo(int f_no, String f_name, int f_price, String filePath, String orgName, String saveName, long fileSize,
			String f_remarks) {
		super();
		this.f_no = f_no;
		this.f_name = f_name;
		this.f_price = f_price;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
		this.f_remarks = f_remarks;
	}


	public int getF_no() {
		return f_no;
	}


	public void setF_no(int f_no) {
		this.f_no = f_no;
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


	public String getF_remarks() {
		return f_remarks;
	}


	public void setF_remarks(String f_remarks) {
		this.f_remarks = f_remarks;
	}


	@Override
	public String toString() {
		return "FoodVo [f_no=" + f_no + ", f_name=" + f_name + ", f_price=" + f_price + ", filePath=" + filePath
				+ ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize=" + fileSize + ", f_remarks="
				+ f_remarks + "]";
	}
	
	
	
	
	


}
