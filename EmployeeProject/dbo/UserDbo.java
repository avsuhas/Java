package com.samson.dbo;

public class UserDbo {
	
	String userName;
	String password;
	int userId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserDbo [userName=" + userName + ", password=" + password + ", userId=" + userId + "]";
	}
	
	

}
