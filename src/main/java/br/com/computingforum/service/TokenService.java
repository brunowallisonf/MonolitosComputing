package br.com.computingforum.service;

import br.com.computingforum.model.Token;
import br.com.computingforum.model.User;

public interface TokenService {
	public Token getByUser(User u);
	public void deleteToken(String token);
	public boolean exists(String token);
	public void save(Token token);
	public Token getOne(String token);
}
