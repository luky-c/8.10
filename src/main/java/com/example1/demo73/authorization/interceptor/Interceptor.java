package com.example1.demo73.authorization.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example1.demo73.authorization.annotation.Authorization;
import com.example1.demo73.authorization.manager.TokenManager;
import com.example1.demo73.authorization.model.TokenModel;
import com.example1.demo73.config.Constant;

@Component
public class Interceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private TokenManager manager;
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception{
		if(!(handler instanceof HandlerMethod)){
			return true;
		}
		HandlerMethod handlerMethod = (HandlerMethod )handler;
		Method method = handlerMethod.getMethod();
		
		String authorization = request.getHeader(Constant.AUTHORIZATION);
		
		TokenModel model = manager.getToken(authorization);
		
		if(manager.checkToken(model)){
			request.setAttribute(Constant.CURRENT_USER_ID, model.getId());
			return true;
		}
		if(method.getAnnotation(Authorization.class) != null){
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return false;
		}
		return true;
	}

}
