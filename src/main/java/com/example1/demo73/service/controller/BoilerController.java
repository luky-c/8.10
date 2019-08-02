package com.example1.demo73.service.controller;

import java.util.List;
import java.util.Random;
import java.util.Set;

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
		System.out.print(boiler.getCorpnName());
		Random r = new Random();
		Long id = (long) Math.random();
		while(manager.checkBoiler(id)!=null){	
		
		id = (long) (r.nextInt(1000)%(1001));
		
		}
		System.out.print(id);
		
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
	public Boiler checkBoiler(@RequestParam Long id){
		return manager.checkBoiler(id);
	}
	
	@Authorization
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public String deleteBoiler(@RequestParam Long id){
		if(manager.checkBoiler(id) == null){
			return "fail";
		}
		manager.deleteBoiler(id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/checkID",method = RequestMethod.GET)
	public List<Long> checkID(@RequestParam String Corpnname){
		return manager.checkID(Corpnname);
	}
	
	@Authorization
	@RequestMapping(value = "/checkName",method = RequestMethod.GET)
	public Set<String> checkName(){
		return manager.checkName();
	}
	
}
