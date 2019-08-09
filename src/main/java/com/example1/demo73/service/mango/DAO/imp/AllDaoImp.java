package com.example1.demo73.service.mango.DAO.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> list = new ArrayList<>();
		Query bquery = Query.query(Criteria.where("_class").is("model.Boiler"));
		Query cquery = Query.query(Criteria.where("_class").is("model.Crane"));
		Query equery = Query.query(Criteria.where("_class").is("model.Elevator"));
	/*	bquery.with(pageable);
		cquery.with(pageable);
		equery.with(pageable);
	*/
		bquery.with(new Sort(Direction.ASC,"id"));
		cquery.with(new Sort(Direction.ASC,"id"));
		equery.with(new Sort(Direction.ASC,"id"));
	
		List<Boiler> Blist = mongoTemplate.find(bquery,Boiler.class, "BoilerCollection");
		List<Crane> Clist = mongoTemplate.find(cquery,Crane.class, "CraneCollection");
		List<Elevator>Elist = mongoTemplate.find(equery,Elevator.class, "ElevatorCollection");
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
	
	
	public List<ShowModel> unitedSelectByResult(String type,String content,String result,int pageIndex,int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return idList;

	}
	public List<ShowModel> unitedSelectByReuslt(String type,String content,String result,String corpnName,int pageIndex,int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));

    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return idList;

	}
	
	public List<ShowModel> unitedSelectByProblem(String type,String problemresult,String problem,String corpnName,int pageIndex,int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return idList;

	}
	
	
	public List<ShowModel> unitedSelectByProblem(String type,String problemresult,String problem,int pageIndex, int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return idList;

	}
	public List<ShowModel> unitedSelectByProblemAndResult(String type,String problemresult,String problem,String content,String result,String corpnName,int pageIndex,int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		
    	}
    	}
    	return idList;
    	
	}
	
	public List<ShowModel> unitedSelectByProblemAndResult(String type,String problemresult,String problem,String content,String result,int pageIndex,int pageSize){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
		Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
    		query.with(pageable);
    		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return idList;

	}
	
	
	
	
	public ResultAndProblem checkResultAndProblem(String type,String content,String corpnName,String id,String problem,int pageIndex,int pageSize){
		QueryBuilder queryBuilder = new QueryBuilder();
	    DBObject fieldsObject = new BasicDBObject();
	    fieldsObject.put("_id", true);
        fieldsObject.put(content, true);
        fieldsObject.put(problem, true);
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.put("type", type);
        dbObject.put("_id", id);
        dbObject.put("corpnName",corpnName);
        queryBuilder.and(dbObject);
        
	    ResultAndProblem model = new ResultAndProblem();
	    Pageable pageable = new PageRequest(pageIndex,pageSize);
        Query query = new BasicQuery(queryBuilder.get(),fieldsObject);
   //     System.out.print(query);
   //     System.out.print(mongoTemplate.find(query, Boiler.class, "BoilerCollection"));
       query.with(pageable);
       query.with(new Sort(Direction.ASC,"id"));
        if(type.equals("Boiler")){
       List< Boiler> blist =  mongoTemplate.find(query, Boiler.class, "BoilerCollection");	  	      	        
        for(Boiler b : blist){
        	String s = JSONObject.toJSONString(b);
        	Map map = (Map) JSONObject.parse(s);
        	model.setProblem((String) map.get(problem));
        	model.setResult((String) map.get(content));
        }
       }
       if(type.equals("Crane")){
	       List< Crane> clist =  mongoTemplate.find(query, Crane.class, "CraneCollection");	  	      	        
	        for(Crane b : clist){
	        	String s = JSONObject.toJSONString(b);
	        	Map map = (Map) JSONObject.parse(s);
	        	model.setProblem((String) map.get(problem));
	        	model.setResult((String) map.get(content));
	        }
	       }
       if(type.equals("Elevator")){
	       List< Elevator> elist =  mongoTemplate.find(query, Elevator.class, "ElevatorCollection");	  	      	        
	        for(Elevator b : elist){
	        	String s = JSONObject.toJSONString(b);
	        	Map map = (Map) JSONObject.parse(s);
	        	model.setProblem((String) map.get(problem));
	        	model.setResult((String) map.get(content));
	        }
	       }


		return model;
	}
	public ResultAndProblem checkResultAndProblem(String type,String content,String id,String problem,int pageIndex,int pageSize){
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
	        
		    ResultAndProblem model = new ResultAndProblem();
		    Pageable pageable = new PageRequest(pageIndex,pageSize);
	        Query query = new BasicQuery(queryBuilder.get(),fieldsObject);
	   //     System.out.print(query);
	   //     System.out.print(mongoTemplate.find(query, Boiler.class, "BoilerCollection"));
	        query.with(pageable);
	        query.with(new Sort(Direction.ASC,"id"));
	        if(type.equals("Boiler")){
	       List< Boiler> blist =  mongoTemplate.find(query, Boiler.class, "BoilerCollection");	  	      	        
	        for(Boiler b : blist){
	        	String s = JSONObject.toJSONString(b);
	        	Map map = (Map) JSONObject.parse(s);
	        	model.setProblem((String) map.get(problem));
	        	model.setResult((String) map.get(content));
	        }
	       }
	       if(type.equals("Crane")){
		       List< Crane> clist =  mongoTemplate.find(query, Crane.class, "CraneCollection");	  	      	        
		        for(Crane b : clist){
		        	String s = JSONObject.toJSONString(b);
		        	Map map = (Map) JSONObject.parse(s);
		        	model.setProblem((String) map.get(problem));
		        	model.setResult((String) map.get(content));
		        }
		       }
	       if(type.equals("Elevator")){
		       List< Elevator> elist =  mongoTemplate.find(query, Elevator.class, "ElevatorCollection");	  	      	        
		        for(Elevator b : elist){
		        	String s = JSONObject.toJSONString(b);
		        	Map map = (Map) JSONObject.parse(s);
		        	model.setProblem((String) map.get(problem));
		        	model.setResult((String) map.get(content));
		        }
		       }


			return model;
		}
		
		
	public Long getALLNum(){
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> list = new ArrayList<>();
		Query bquery = Query.query(Criteria.where("_class").is("model.Boiler"));
		Query cquery = Query.query(Criteria.where("_class").is("model.Crane"));
		Query equery = Query.query(Criteria.where("_class").is("model.Elevator"));
		
		List<Boiler> Blist = mongoTemplate.find(bquery,Boiler.class, "BoilerCollection");
		List<Crane> Clist = mongoTemplate.find(cquery,Crane.class, "CraneCollection");
		List<Elevator>Elist = mongoTemplate.find(equery,Elevator.class, "ElevatorCollection");
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
		return  (long) list.size();
	}
	
	
	public Long unitedSelectByResultNum(String type,String content,String result){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
			
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(content).is(result));
    		
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return (long) idList.size();

	}
	public Long unitedSelectByReusltNum(String type,String content,String result,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));

    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(content).is(result).and("corpnName").is(corpnName));
   // 		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return (long) idList.size();

	}
	
	public Long unitedSelectByProblemNum(String type,String problemresult,String problem,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return (long) idList.size();

	}
	
	
	public Long unitedSelectByProblemNum(String type,String problemresult,String problem){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
   // 		query.with(pageable);
   // 		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern));
  //  		query.with(pageable);
  //  		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return (long) idList.size();

	}
	public Long unitedSelectByProblemAndResultNum(String type,String problemresult,String problem,String content,String result,String corpnName){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result).and("corpnName").is(corpnName));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		
    	}
    	}
    	return (long) idList.size();
    	
	}
	
	public Long unitedSelectByProblemAndResultNum(String type,String problemresult,String problem,String content,String result){
		/*
		String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	*/
	//	Pageable pageable = new PageRequest(pageIndex,pageSize);
		List<ShowModel> idList = new ArrayList<>();
		Pattern pattern = Pattern.compile("^.*"+problemresult+".*$", Pattern.CASE_INSENSITIVE);
    	if(type.equals("Boiler")){
    //		List<Boiler> Blist = mongoTemplate.findAll(Boiler.class, "BoilerCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
   // 		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Boiler> blist = mongoTemplate.find (query,Boiler.class,"BoilerCollection");
    		for(Boiler boiler : blist){
    			ShowModel showModel = new ShowModel(boiler);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Crane")){
   // 		List<Crane> clist = mongoTemplate.findAll(Crane.class, "CraneCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
    //		query.with(pageable);
    //		query.with(new Sort(Direction.ASC,"id"));
    		List<Crane> clist = mongoTemplate.find (query,Crane.class,"CraneCollection");
    		for(Crane crane : clist){
    			ShowModel showModel = new ShowModel(crane);
    			idList.add(showModel);
    		}
    	}
    	if(type.equals("Elevator")){
  //  		List<Elevator> Elist = mongoTemplate.findAll(Elevator.class, "ElevatorCollection");
    		Query query = new Query(Criteria.where(problem).regex(pattern).and(content).is(result));
  //  		query.with(pageable);
   // 		query.with(new Sort(Direction.ASC,"id"));
    		List<Elevator> elist = mongoTemplate.find (query,Elevator.class,"ElevatorCollection");
    		for(Elevator elevator : elist){
    			ShowModel showModel = new ShowModel(elevator);
    			idList.add(showModel);
    		}
    	}
    	return (long) idList.size();

	}
	
	
	
	public List<ShowModel> checkByCom(String Corpnname){
		List<ShowModel> list = new ArrayList<>();
		
		
		Query query = new Query();
		Criteria criteria = Criteria.where("corpnName").is(Corpnname); 
		 query.addCriteria(criteria);
		List<Boiler> Blist = mongoTemplate.find(query, Boiler.class,"BoilerCollection");
		List<Crane> clist = mongoTemplate.find(query, Crane.class,"CraneCollection");
		List<Elevator> elist = mongoTemplate.find(query, Elevator.class,"ElevatorCollection");
		for(Boiler boiler : Blist){
			
			
			ShowModel showModel = new ShowModel(boiler);
			list.add(showModel);
			
			
		}
		for(Crane crane : clist){
			ShowModel showModel = new ShowModel(crane);
			list.add(showModel);
		}
		for(Elevator elevator : elist){
			ShowModel showModel = new ShowModel(elevator);
			list.add(showModel);
		}
		return list;
	}
	
	public List<ShowModel> checkByType(String Type){
		List<ShowModel> list = new ArrayList<>();
		
		
		Query query = new Query();
		Criteria criteria = Criteria.where("type").is(Type); 
		 query.addCriteria(criteria);
		List<Boiler> Blist = mongoTemplate.find(query, Boiler.class,"BoilerCollection");
		List<Crane> clist = mongoTemplate.find(query, Crane.class,"CraneCollection");
		List<Elevator> elist = mongoTemplate.find(query, Elevator.class,"ElevatorCollection");
		for(Boiler boiler : Blist){
			
			
			ShowModel showModel = new ShowModel(boiler);
			list.add(showModel);
			
			
		}
		for(Crane crane : clist){
			ShowModel showModel = new ShowModel(crane);
			list.add(showModel);
		}
		for(Elevator elevator : elist){
			ShowModel showModel = new ShowModel(elevator);
			list.add(showModel);
		}
		return list;
	}
}