package com.example1.demo73.service.controller;

import java.util.List;

import model.UniteCheckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.service.mango.DAO.imp.AllDaoImp;

import model.ResultAndProblem;
import model.ShowModel;

@RestController
@RequestMapping("/all")
public class AllController {
	@Autowired
	private AllDaoImp manager;

    @RequestMapping(value = "check",method = RequestMethod.GET)
    @Authorization
    public List<ShowModel> getAll(){
    	return manager.getALL();
    }
    
    @RequestMapping(value = "select" , method = RequestMethod.GET)
    @Authorization
    public List<String> check(@RequestBody UniteCheckModel model){
    	String problemResult = model.getProblemresult();
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	if(type == null){
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
    		return manager.unitedSelectByResult(type, content, result);
    	}
    	if(corpnName != null && problem == null){
    		return manager.unitedSelectByReuslt(type, content, result,corpnName);
    	}
    	if(corpnName == null && result == null){
    		return manager.unitedSelectByProblem(type, problemResult, problem);
    	}
    	if(corpnName != null && result == null){
    		return manager.unitedSelectByProblem(type, problemResult, problem, corpnName);
    	}
    	if(corpnName == null && problem != null && result != null){
    		return manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result);
    	}
    	if(corpnName != null && problem != null && result != null){
    		return manager.unitedSelectByProblemAndResult(type, problemResult, problem, content, result, corpnName);
    	}
    	return null;
    	
    }
    @RequestMapping(value = "checkResult" , method = RequestMethod.GET)
    @Authorization
    public ResultAndProblem checkResult(@RequestBody UniteCheckModel model){
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	String id = model.getId();
    	if(corpnName == null){
    		return manager.checkResultAndProblem(type, content, id, problem);
    	}
    	return manager.checkResultAndProblem(type, content, corpnName, id, problem);
    }
    
    
   
}
