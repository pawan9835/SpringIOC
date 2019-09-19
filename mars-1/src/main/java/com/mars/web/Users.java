package com.mars.web;

public class Users {
	
	private String userID;
	private String userPwd;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "UserLogin [userID=" + userID + ", userPwd=" + userPwd + "]";
	}
	

}
