package com.example1.demo73.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;
	
	public Admin(){}
	
	public Admin(String name,String password){
		this.name=name;
		this.password=password;
	}
	public String getPassword(){
		return this.password;
	}
	public long getId(){
		return this.id;
	}
}
