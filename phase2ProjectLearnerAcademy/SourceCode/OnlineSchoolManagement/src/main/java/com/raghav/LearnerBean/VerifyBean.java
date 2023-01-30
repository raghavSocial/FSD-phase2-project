package com.raghav.LearnerBean;

public class VerifyBean 

{

	private	String admin_username;
	private String admin_password;
	
	
	// default constructor already present
	
	public String getAdmin_username() {
		return admin_username;
	}
	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	
	
	
	@Override
	public String toString() {
		return "VerifyBean [admin_username=" + admin_username + ", admin_password=" + admin_password + "]";
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	

	
	
	
	
}
