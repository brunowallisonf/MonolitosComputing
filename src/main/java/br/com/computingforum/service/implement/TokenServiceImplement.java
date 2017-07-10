package br.com.computingforum.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.computingforum.dao.TokenRepository;
import br.com.computingforum.model.Token;
import br.com.computingforum.model.User;
import br.com.computingforum.service.TokenService;
@Service
public class TokenServiceImplement implements TokenService{
	@Autowired
	private TokenRepository tokenrepository;
	@Override
	public List <Token>getByUser(User u) {
		return tokenrepository.findByUser(u);
	}

	@Override
	public void deleteToken(String token) {
		tokenrepository.delete(token);
	}

	@Override
	public boolean exists(String token) {
		return tokenrepository.exists(token);
	}

	@Override
	public void save(Token token) {
		tokenrepository.save(token);

	}

	@Override
	public Token getOne(String token) {

		return tokenrepository.getOne(token);
	}

}
