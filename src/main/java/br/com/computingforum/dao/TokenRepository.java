package br.com.computingforum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.computingforum.model.Token;
import br.com.computingforum.model.User;

public interface TokenRepository extends JpaRepository<Token,String> {
	List<Token> findByUser(User user);
}
