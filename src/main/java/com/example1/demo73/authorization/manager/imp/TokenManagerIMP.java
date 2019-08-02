package com.example1.demo73.authorization.manager.imp;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.stereotype.Component;

import com.example1.demo73.authorization.manager.TokenManager;
import com.example1.demo73.authorization.model.TokenModel;
import com.example1.demo73.config.Constant;

@Component
public class TokenManagerIMP implements TokenManager{
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	 @Autowired
	    public void setRedis(RedisTemplate redisTemplate) {
	        this.redisTemplate = redisTemplate;
	        //泛型设置成Long后必须更改对应的序列化方案
	        redisTemplate.setKeySerializer(new JdkSerializationRedisSerializer());
	    }
	
	public TokenModel createToken(Long id){
		 String token = UUID.randomUUID().toString().replace("-", "");
		 TokenModel model = new TokenModel(token,id);
		 redisTemplate.boundValueOps(id).set(token,Constant.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
		 return model;
	}
	
	public TokenModel getToken(String authorization){
		if(authorization == null){
			return null;
		}
		String[] param = authorization.split("_");
		if(param.length != 2){
			return null;
		}
		Long id = Long.valueOf(param[0]);
		TokenModel model = new TokenModel(param[1],id);
		return model;
	}
	
	public boolean checkToken(TokenModel model){
		if(model == null){
			return false;
		}
		String token = (String) redisTemplate.boundValueOps(model.getId()).get();
	        if (token == null || !token.equals(model.getToken())) {
	            return false;
	        }
	        
	   redisTemplate.boundValueOps(model.getId()).expire(Constant.TOKEN_EXPIRES_HOUR, TimeUnit.HOURS);
	    return true;
		
	}
	public void deleteToken(Long id){
		redisTemplate.delete(id);
	}

}
