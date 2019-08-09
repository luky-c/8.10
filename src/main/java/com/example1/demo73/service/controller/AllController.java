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

    @RequestMapping(value = "check",method = RequestMethod.GET)
    @Authorization
    public SelectResult getAll(@RequestParam int pageIndex){
    	List<ShowModel>list = manager.getALL(pageIndex,Constant.PAGESIZE);
    	long num = list.size();
    	if(num == 0){
    		return null;
    	}
    	return new SelectResult(list,num);
    }
    
    @RequestMapping(value = "select" , method = RequestMethod.POST)
    @Authorization
    public SelectResult check(@RequestBody UniteCheckModel model){
    	String problemResult = model.getProblemResult();
    	
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	Integer pageIndex = model.getPageIndex();
    	Integer pageSize = Constant.PAGESIZE;
    	List<ShowModel>list = new ArrayList<>();
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
    	}
    	
    	if(corpnName != null && problem == null){
    		list= manager.unitedSelectByReuslt(type, content, result,corpnName,pageIndex,pageSize);
    	}
    	
    	if(corpnName == null && result == null){
    		
        	list= manager.unitedSelectByProblem(type, problemResult, problem,pageIndex,pageSize);
    	}
    	
    	if(corpnName != null && result == null){
    		list= manager.unitedSelectByProblem(type, problemResult, problem, corpnName,pageIndex,pageSize);
    	}
    	if(corpnName == null && problem != null && result != null){
    		list= manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result,pageIndex,pageSize);
    	}
    	if(corpnName != null && problem != null && result != null){
    		list= manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result, corpnName,pageIndex,pageSize);
    	}
    	if(list.size() == 0){
    	return null;
    	}
    	return new SelectResult(list,list.size());
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
