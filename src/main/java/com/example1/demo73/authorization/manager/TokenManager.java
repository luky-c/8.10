package com.example1.demo73.authorization.manager;

import com.example1.demo73.authorization.model.TokenModel;

public interface TokenManager {
	public TokenModel createToken(Long id);
	public boolean checkToken(TokenModel model);
	public TokenModel getToken(String authorization);
	public void deleteToken(Long id);
}
