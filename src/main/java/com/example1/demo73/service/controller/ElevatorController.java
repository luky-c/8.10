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
import com.example1.demo73.service.mango.DAO.imp.ElevatorDaoImp;

import model.Elevator;

@RestController
@RequestMapping(value = "/Elevator")
public class ElevatorController {
	@Autowired
	private ElevatorDaoImp manager;
	
	
	
	
	@Authorization
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addElevator(@RequestBody Elevator Elevator){
		long id = (long) Math.random();
		Random r = new Random();
		while(manager.checkElevator(id)!=null){		
		id = (long) (r.nextInt(1000)%(1001));;
		}
		manager.addNewElevator(Elevator, id);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/change",method = RequestMethod.PUT)
	public String changeElevator(@RequestBody Elevator Elevator){
		if(Elevator.getId() == null || manager.checkElevator(Elevator.getId()) == null){
			return "fail";
		}
		manager.changeElevator(Elevator);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/check",method = RequestMethod.GET)
	public Elevator checkElevator(@RequestParam Long id){
		return manager.checkElevator(id);
	}
	
	@Authorization
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public String deleteElevator(@RequestParam Long id){
		if(manager.checkElevator(id) == null){
			return "fail";
		}
		manager.deleteElevator(id);
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
