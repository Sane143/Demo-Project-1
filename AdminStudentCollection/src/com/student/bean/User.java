package com.student.bean;

public class User 
{
	private String sname;
	private int mobile;
	private String emailid;
	private String username;
	private String password;
	public User(String sname, int mobile, String emailid, String username, String password) {
		super();
		this.sname = sname;
		this.mobile = mobile;
		this.emailid = emailid;
		this.username = username;
		this.password = password;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "" + sname + "\t" + mobile + "\t" + emailid + "\t" + username
				+ "\t" + password + "";
	}
	
}
