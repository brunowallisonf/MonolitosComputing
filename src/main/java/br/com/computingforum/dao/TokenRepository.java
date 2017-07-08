package br.com.computingforum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.computingforum.model.Token;
import br.com.computingforum.model.User;

public interface TokenRepository extends JpaRepository<Token,String> {
	Token findByUser(User user);
}
