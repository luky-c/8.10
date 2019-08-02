package com.example1.demo73.authorization.model;

public class TokenModel {
	private String token;
	private Long id;
	
	public TokenModel(){}
		
	public TokenModel(String token,Long id){
		this.id=id;
		this.token=token;
	}
	
	public void setToken(String token){
		this.token=token;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getToken(){
		return this.token;
	}
	public Long getId(){
		return this.id;
	}
}
