package com.example1.demo73.service.mango.DAO.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example1.demo73.service.mango.DAO.AllDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.QueryBuilder;

import model.Boiler;
import model.Crane;
import model.Elevator;
import model.ResultAndProblem;
import model.ShowModel;
import model.UniteCheckModel;

@Component
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
	
	
	public List<String> unitedSelectByResult(String type,String content,String result){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(content).is(result)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(content).is(result)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(content).is(result)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	public List<String> unitedSelectByReuslt(String type,String content,String result,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	
	public List<String> unitedSelectByProblem(String type,String problemresult,String problem,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	
	
	public List<String> unitedSelectByProblem(String type,String problemresult,String problem){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	public List<String> unitedSelectByProblemAndResult(String type,String problemresult,String problem,String content,String result,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	
	public List<String> unitedSelectByProblemAndResult(String type,String problemresult,String problem,String content,String result){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		List<String> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		
    		List<Boiler> blist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result)),Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			idList.add(boiler.getId());
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		List<Crane> clist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result)),Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			idList.add(crane.getId());
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		List<Elevator> elist = mongoTemplate.find (new Query(Criteria.where(problem).regex(pattern).and(content).is(result)),Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			idList.add(elevator.getId());
    		}
    	}
    	return idList;

	}
	
	
	
	public ResultAndProblem checkResultAndProblem(String type,String content,String corpnName,String id,String problem){
	//	Boiler boiler = (Boiler) mongoTemplate.find (new Query(Criteria.where("id").is(id).and("corpnName").is(corpnName)),Boiler.class,"BoilerCollection");

	    DBObject fieldsObject = new BasicDBObject();
	    fieldsObject.put("_id", true);
        fieldsObject.put(content, true);
        fieldsObject.put(problem, true);
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("type", type);
        dbObject.put("_id", id);
        dbObject.put("corpnName", corpnName);

        Query query = new BasicQuery(dbObject,fieldsObject);
        System.out.print(query);
        ResultAndProblem model = new ResultAndProblem();
        model.setProblem((String) query.getQueryObject().get(problem));
        model.setProblem((String) query.getQueryObject().get(content));
		return model;
	}
	public ResultAndProblem checkResultAndProblem(String type,String content,String id,String problem){
		//	Boiler boiler = (Boiler) mongoTemplate.find (new Query(Criteria.where("id").is(id).and("corpnName").is(corpnName)),Boiler.class,"BoilerCollection");
			QueryBuilder queryBuilder = new QueryBuilder();
		    DBObject fieldsObject = new BasicDBObject();
		    fieldsObject.put("_id", true);
	        fieldsObject.put(content, true);
	        fieldsObject.put(problem, true);
	        BasicDBObject dbObject = new BasicDBObject();
	        dbObject.put("type", type);
	        dbObject.put("_id", id);
	        queryBuilder.and(dbObject);
	        

	        Query query = new BasicQuery(queryBuilder.get(),fieldsObject);
	   //     System.out.print(query);
	   //     System.out.print(mongoTemplate.find(query, Boiler.class, "BoilerCollection"));
	       List< Boiler> blist =  mongoTemplate.find(query, Boiler.class, "BoilerCollection");
	  
	        
	       ResultAndProblem model = new ResultAndProblem();
	        
	        for(Boiler b : blist){
	        	String s = JSONObject.toJSONString(b);
	        	Map map = (Map) JSONObject.parse(s);
	        	model.setProblem((String) map.get(problem));
	        	model.setResult((String) map.get(content));
	        }
	       

			return model;
		}
	
}