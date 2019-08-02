package com.example1.demo73.service.controller;

import java.util.List;

import model.UniteCheckModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.service.mango.DAO.imp.AllDaoImp;

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
    public Long check(UniteCheckModel model){
    	String type = model.getType();
    	String inspection = model.getInspection();
    	String content = model.getContent();
    	String result = model.getResult();
    	String corpnName = model.getCorpnName();
    	String problem = model.getProblem();
    	if(type.equals("锅炉"))
    }
    
   
}
