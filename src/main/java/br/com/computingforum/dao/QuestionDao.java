package br.com.computingforum.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.computingforum.model.Question;
@Transactional
public interface QuestionDao extends JpaRepository<Question, Long>{
	
}
