package com.example1.demo73.authorization.model;

public class AdminModel {
	private String adminName;
	private String adminPass;
	public AdminModel(){}
	public void setAdminName(String name){
		this.adminName=name;
	}
	public void setAdminPass(String pass){
		this.adminPass=pass;
	}
	public String getAdminName(){
		return this.adminName;
	}
	public String getAdminPass(){
		return this.adminPass;
	}
}
