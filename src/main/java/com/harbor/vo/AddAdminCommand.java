package com.harbor.vo;

import java.util.Date;

public class AddAdminCommand {
	
	private String AdminName;
	private String UserName;
	private String Password;
	private String AdminRole;
	private Date CreationDate;
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAdminRole() {
		return AdminRole;
	}
	public void setAdminRole(String adminRole) {
		AdminRole = adminRole;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	

}
