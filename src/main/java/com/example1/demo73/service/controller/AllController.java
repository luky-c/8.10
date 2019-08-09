package com.example1.demo73.service.controller;

import java.util.ArrayList;
import java.util.List;

import model.UniteCheckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.config.Constant;
import com.example1.demo73.service.mango.DAO.imp.AllDaoImp;

import model.ResultAndProblem;
import model.SelectResult;
import model.ShowModel;

@RestController
@RequestMapping("/all")
public class AllController {
	@Autowired
	private AllDaoImp manager;
	
	 @RequestMapping(value = "checkByCom",method = RequestMethod.GET)
	 @Authorization
	 public SelectResult getAllC(@RequestParam int pageIndex,@RequestParam String corpnName){
	    if(pageIndex <0){
	    		return null;
	    	}
	    	List<ShowModel>alllist = manager.checkByCom(corpnName);
	    	List<ShowModel>list = new ArrayList<>();
	    	int num0 =  alllist.size();
	     	if(num0 == 0){
	    		return null;
	    	}
	    	int begin = pageIndex * 10;
	    	int end = (pageIndex+1)*10;
	    	if(begin > num0-1){
	    		return null;
	    	}
	    	if(begin <= num0-1 && end >num0){
	    		list = alllist.subList(begin, num0);
	    	}
	    	else{
	    	list = alllist.subList(begin, end);
	    	}
	    	Long num  = (long) num0;
	    	return new SelectResult(list,num);
	    }
	 
	 
	 @RequestMapping(value = "checkByType",method = RequestMethod.GET)
	 @Authorization
	 public SelectResult getAllT(@RequestParam int pageIndex,@RequestParam String type){
	    if(pageIndex <0){
	    		return null;
	    	}
	    	List<ShowModel>alllist = manager.checkByType(type);
	    	List<ShowModel>list = new ArrayList<>();
	    	int num0 =  alllist.size();
	     	if(num0 == 0){
	    		return null;
	    	}
	    	int begin = pageIndex * 10;
	    	int end = (pageIndex+1)*10;
	    	
	    	if(begin > num0-1){
	    		return null;
	    	}
	    	if(begin <= num0-1 && end >num0){
	    		list = alllist.subList(begin, num0);
	    	}
	    	else{
	    	list = alllist.subList(begin, end);
	    	}
	    	Long num  = (long) num0;
	    	return new SelectResult(list,num);
	    }
	 
	 
    @RequestMapping(value = "check",method = RequestMethod.GET)
    @Authorization
    public SelectResult getAll(@RequestParam int pageIndex){
    	if(pageIndex <0){
    		return null;
    	}
    	List<ShowModel>alllist = manager.getALL();
    	List<ShowModel>list = new ArrayList<>();
    	int num0 =  alllist.size();
     	if(num0 == 0){
    		return null;
    	}
     	System.out.print(num0);
    	int begin = pageIndex * 10;
    	int end = (pageIndex+1)*10;
    	
    	if(begin > num0-1){
    		return null;
    	}
    	if(begin <= num0-1 && end >num0){
    		list = alllist.subList(begin, num0);
    	
    	}
    	else{
    	list = alllist.subList(begin, end);
    	}
    	Long num  = (long) num0;
    	return new SelectResult(list,num);
    }
    
    @RequestMapping(value = "select" , method = RequestMethod.POST)
    @Authorization
    public SelectResult check(@RequestBody UniteCheckModel model){
    	String problemResult = model.getProblemResult();
    	if(problemResult !=null){
    		System.out.print(problemResult);
    	}
    	else{
    		System.out.print("nothing");
    	}
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	Integer pageIndex = model.getPageIndex();
    	Integer pageSize = Constant.PAGESIZE;
    	List<ShowModel>list = new ArrayList<>();
    	Long num = null;
    	if(type == null){
    		return null;
    	}
    	if(pageIndex == null || pageSize == null){
    		return null;
    	}
    	
    	if(content == null && problem == null){
    		return null;
    	}
    	
    	if(result == null && problemResult == null){
    		return null;
    	}
    	
    	if(problem != null && problemResult == null){
    		return null;
    	}
    	
    	if(content != null && result == null){
    		return null;
    	}
    	
    	if(corpnName == null && problem == null){
    		list = manager.unitedSelectByResult(type, content, result,pageIndex,pageSize);
    		num = manager.unitedSelectByResultNum(type, content, result);
    	}
    	
    	if(corpnName != null && problem == null){
    		list= manager.unitedSelectByReuslt(type, content, result,corpnName,pageIndex,pageSize);
    		num = manager.unitedSelectByReusltNum(type, content, result, corpnName);
    	}
    	
    	if(corpnName == null && result == null){
    		
        	list= manager.unitedSelectByProblem(type, problemResult, problem,pageIndex,pageSize);
        	num = manager.unitedSelectByProblemNum(type, problemResult, problem);
    	}
    	
    	if(corpnName != null && result == null){
    		list= manager.unitedSelectByProblem(type, problemResult, problem, corpnName,pageIndex,pageSize);
    		num = manager.unitedSelectByProblemNum(type, problemResult, problem, corpnName);
    	}
    	if(corpnName == null && problem != null && result != null){
    		list= manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result,pageIndex,pageSize);
    		num = manager.unitedSelectByProblemAndResultNum(type, problemResult, problem, content, result);
    	}
    	if(corpnName != null && problem != null && result != null){
    		list= manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result, corpnName,pageIndex,pageSize);
    		num = manager.unitedSelectByProblemAndResultNum(type, problemResult, problem, content, result, corpnName);
    	}
    	if(num == 0){
    	return null;
    	}
    	return new SelectResult(list,num);
    }
    @RequestMapping(value = "checkResult" , method = RequestMethod.POST)
    @Authorization
    public ResultAndProblem checkResult(@RequestBody UniteCheckModel model){
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	String id = model.getId();
    	Integer pageIndex = model.getPageIndex();
    	Integer pageSize = Constant.PAGESIZE;
       	if(pageIndex == null || pageSize == null){
    		return null;
    	}
    	if(corpnName == null){
    		return manager.checkResultAndProblem(type, content, id, problem,pageIndex,pageSize);
    	}
    	return manager.checkResultAndProblem(type, content, corpnName, id, problem,pageIndex,pageSize);
    }
    
    
   
}
