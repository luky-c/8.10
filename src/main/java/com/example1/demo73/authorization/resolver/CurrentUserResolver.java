package com.example1.demo73.authorization.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import com.example1.demo73.authorization.annotation.CurrentUser;
import com.example1.demo73.config.Constant;
import com.example1.demo73.mysql.Repository.UserRepository;
import com.example1.demo73.mysql.domain.User;



@Component
public class CurrentUserResolver implements HandlerMethodArgumentResolver{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean supportsParameter(MethodParameter parameter){
		if(parameter.getParameterType().isAssignableFrom(User.class)&& parameter.hasParameterAnnotation(CurrentUser.class)){
			return true;
		}
		return false;
	}
	
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		Long currentuserId = (Long) webRequest.getAttribute(Constant.CURRENT_USER_ID, RequestAttributes.SCOPE_REQUEST);
		if(currentuserId != null){
			return userRepository.findOne(currentuserId);
		}
		throw new MissingServletRequestPartException(Constant.CURRENT_USER_ID);
	}

}
