package br.com.computingforum.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.computingforum.model.User;
@org.springframework.transaction.annotation.Transactional
public interface UserDao extends JpaRepository<User, String> {
	
		
}
