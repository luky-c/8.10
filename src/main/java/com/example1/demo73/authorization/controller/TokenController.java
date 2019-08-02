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
import com.example1.demo73.authorization.model.ResultModel;
import com.example1.demo73.authorization.model.TokenModel;
import com.example1.demo73.authorization.model.UserModel;
import com.example1.demo73.config.ResultStatus;
import com.example1.demo73.mysql.Repository.UserRepository;
import com.example1.demo73.mysql.domain.User;


@RestController
@RequestMapping("/tokens")
public class TokenController {
	
	@Autowired
	private TokenManager manager;
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "",method = RequestMethod.POST)
	public ResponseEntity<ResultModel> login(@RequestBody UserModel user1){
		 Assert.notNull(user1, "user can not be empty");
	     String username = user1.getUsername();
	     String password = user1.getPassword();
	    
	     User user = userRepository.findByName(username);
	     
	     
	     if(user == null || !(user.getPassword().equals(password))){
	    	 return new ResponseEntity<>(ResultModel.error(ResultStatus.USERNAME_OR_PASSWORD_ERROR), HttpStatus.NOT_FOUND);
	     }
	     TokenModel model =  manager.createToken(user.getId());
	     return new ResponseEntity<>(ResultModel.ok(model),HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "",method = RequestMethod.DELETE)
	@Authorization
	public ResponseEntity<ResultModel> logout(@CurrentUser User user){
		manager.deleteToken(user.getId());
		return new ResponseEntity<>(ResultModel.ok(),HttpStatus.OK);
	}
	
}
