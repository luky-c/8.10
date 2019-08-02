package com.example1.demo73.authorization.model;

public class UserModel {
  private String username;
  private String password;
  
  UserModel(){}
  public String getUsername(){
	  return this.username;
  }
  public String getPassword(){
	  return this.password;
  }
  public void setUsername(String username){
	  this.username=username;
  }
  public void setPassword(String password){
	  this.password= password;
  }
}
