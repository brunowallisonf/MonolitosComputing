package br.com.computingforum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.computingforum.model.User;

public interface AnswerDao extends JpaRepository<User, String> {

}
