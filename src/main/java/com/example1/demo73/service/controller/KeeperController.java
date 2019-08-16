package com.example1.demo73.service.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.service.mango.DAO.imp.KeeperDaoImp;

import model.ElevatorKeeper;

@RestController
@RequestMapping(value = "/keeper")
public class KeeperController {
	@Autowired
	private KeeperDaoImp manager;
	
	@Authorization
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String addKeeper(@RequestBody ElevatorKeeper keeper){
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		String id = str.replace("-", "");
		keeper.setId(id);
		keeper.setType("Keeper");
		manager.addKeeper(keeper);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "/change",method = RequestMethod.PUT)
	public String changeKeeper(@RequestBody ElevatorKeeper keeper){
		if(keeper.getId() == null || manager.checkKeeper(keeper.getId()) == null){
			return "fail";
		}
		manager.changeKeeper(keeper);
		return "success";
	}
	@Authorization
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public String deleteKeeper(@RequestParam String id){
		if(id == null || manager.checkKeeper(id)==null){
			return "fail";
		}
		manager.deleteKeeper(id);
		return "success";
	}
	@Authorization
	@RequestMapping(value = "/check",method = RequestMethod.GET)
	public ElevatorKeeper checkKeeper(@RequestParam String id){
		if(id == null){
			return null;
		}
		return manager.checkKeeper(id);
	}
		
	
}
