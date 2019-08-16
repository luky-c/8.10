package com.example1.demo73.authorization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.authorization.annotation.CurrentUser;
import com.example1.demo73.authorization.manager.TokenManager;
import com.example1.demo73.authorization.model.AdminModel;
import com.example1.demo73.authorization.model.ResultModel;
import com.example1.demo73.authorization.model.TokenModel;
import com.example1.demo73.authorization.model.UserModel;
import com.example1.demo73.config.ResultStatus;
import com.example1.demo73.mysql.Repository.AdminRepository;
import com.example1.demo73.mysql.Repository.UserRepository;
import com.example1.demo73.mysql.domain.Admin;
import com.example1.demo73.mysql.domain.User;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
	@Autowired
	private TokenManager manager;
	@Autowired
	private AdminRepository adminRepository; 
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public ResponseEntity<ResultModel> login(@RequestBody AdminModel admin){
		Assert.notNull(admin,"admin can not be empty");
		 String username = admin.getAdminName();
	     String password = admin.getAdminPass();
	    
	     Admin admin1 = adminRepository.findByName(username);
	     
	     
	     if(admin1 == null || !(admin1.getPassword().equals(password))){
	    	 return new ResponseEntity<>(ResultModel.error(ResultStatus.USERNAME_OR_PASSWORD_ERROR), HttpStatus.NOT_FOUND);
	     }
	     TokenModel model =  manager.createToken(admin1.getId());
	     return new ResponseEntity<>(ResultModel.ok(model),HttpStatus.OK);
	}
	
	@Authorization
	@RequestMapping(value = "/logout",method = RequestMethod.DELETE)
	public ResponseEntity<ResultModel> logout(@CurrentUser Admin admin){
		manager.deleteToken(admin.getId());
		return new ResponseEntity<>(ResultModel.ok(),HttpStatus.OK);
	}
		
	@Authorization
	@RequestMapping(value = "create",method = RequestMethod.POST)
	public String createUser(@RequestBody UserModel user){
		Assert.notNull(user, "user can not be null");
		if(userRepository.findByName(user.getUsername()) != null){
			return "该用户名已注册";
		}
		User user1 = new User(user.getUsername(),user.getPassword());
		
		userRepository.save(user1);
		return "success";
	}
	
	@Authorization
	@RequestMapping(value = "delete",method = RequestMethod.DELETE)
	public String deleteUser(@RequestParam String name){
		Assert.notNull(name, "name can not be null");
		if(userRepository.findByName(name) == null){
			return "无此用户";
		}
		userRepository.delete(userRepository.findByName(name));
		return "success";
	}
	

}
