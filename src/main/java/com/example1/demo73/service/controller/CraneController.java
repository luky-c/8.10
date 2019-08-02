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

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.service.mango.DAO.imp.CraneDaoImp;

import model.Crane;

@RestController
@RequestMapping(value = "/Crane")
public class CraneController {
	@Autowired
	private CraneDaoImp manager;
	
	@Authorization
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addCrane(@RequestBody Crane Crane){
		Crane.setType("Crane");
		long id = (long) Math.random();
		Random r = new Random();
		while(manager.checkCrane(id)!=null){		
		id = (long) (r.nextInt(1000)%(1001));
		}
		manager.addNewCrane(Crane, id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/change",method = RequestMethod.PUT)
	public String changeCrane(@RequestBody Crane Crane){
		if(Crane.getId() == null || manager.checkCrane(Crane.getId()) == null){
			return "fail";
		}
		manager.changeCrane(Crane);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/check",method = RequestMethod.GET)
	public Crane checkCrane(@RequestParam Long id){
		return manager.checkCrane(id);
	}
	
	@Authorization
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public String deleteCrane(@RequestParam Long id){
		if(manager.checkCrane(id) == null){
			return "fail";
		}
		manager.deleteCrane(id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/checkID",method = RequestMethod.GET)
	public List<Long> checkID(@RequestParam String corpnName){
		return manager.checkID(corpnName);
	}
	@Authorization
	@RequestMapping(value = "/checkName",method = RequestMethod.GET)
	public Set<String> checkName(){
		return manager.checkName();
	}
}
