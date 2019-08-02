package com.example1.demo73.service.mango.DAO.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.example1.demo73.service.mango.DAO.AllDao;

import model.Boiler;
import model.Crane;
import model.Elevator;
import model.ShowModel;
import model.UniteCheckModel;

public class AllDaoImp implements AllDao{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Boiler> getAllBoiler(){
		return mongoTemplate.findAll(Boiler.class, "BoilerCollection");
	}
	public List<Crane> getAllCrane(){
		return mongoTemplate.findAll(Crane.class, "CraneCollection");
	}
	public List<Elevator> getAllElevator(){
		return mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
	}
	
	@Override
	public List<ShowModel> getALL(){
		List<ShowModel> list = new ArrayList<>();
		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
		List<Crane> Clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
		List<Elevator>Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
		for(Boiler boiler : Blist){
			ShowModel showModel = new ShowModel(boiler);
			list.add(showModel);
		}
		for(Crane crane : Clist){
			ShowModel showModel = new ShowModel(crane);
			list.add(showModel);
		}
		for(Elevator elevator : Elist){
			ShowModel showModel = new ShowModel(elevator);
			list.add(showModel);
		}
		return list;
	}
	
	
	public String unitedSelect(String type,String content){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
    	if(type.equals("锅炉")){
    		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		mongoTemplate.find (new Query(Criteria.where("").is("002")),entityClass)

    	}
    	if(type.equals("起重机")){
    		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    	}
    	if(type.equals("电梯")){
    		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    	}
    	

	}
	
}