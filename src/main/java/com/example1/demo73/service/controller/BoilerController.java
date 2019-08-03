package com.example1.demo73.service.controller;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.service.mango.DAO.imp.BoilerDaoImp;

import model.Boiler;

@RestController
@RequestMapping(value = "/boiler")
public class BoilerController {
	@Autowired
	private BoilerDaoImp manager;
	
	@Authorization
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addBoiler(@RequestBody Boiler boiler){
		boiler.setType("Boiler");
	    UUID uuid=UUID.randomUUID();
	    String str = uuid.toString(); 
	    String id=str.replace("-", "");

		
		manager.addNewBoiler(boiler,id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/change",method = RequestMethod.PUT)
	public String changeBoiler(@RequestBody Boiler boiler){
		if(boiler.getId() == null || manager.checkBoiler(boiler.getId()) == null){
			return "fail";
		}
		manager.changeBoiler(boiler);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/check",method = RequestMethod.GET)
	public Boiler checkBoiler(@RequestParam String id){
		return manager.checkBoiler(id);
	}
	
	@Authorization
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public String deleteBoiler(@RequestParam String id){
		if(manager.checkBoiler(id) == null){
			return "fail";
		}
		manager.deleteBoiler(id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/checkID",method = RequestMethod.GET)
	public List<String> checkID(@RequestParam String Corpnname){
		return manager.checkID(Corpnname);
	}
	
	@Authorization
	@RequestMapping(value = "/checkName",method = RequestMethod.GET)
	public Set<String> checkName(){
		return manager.checkName();
	}
	
}
