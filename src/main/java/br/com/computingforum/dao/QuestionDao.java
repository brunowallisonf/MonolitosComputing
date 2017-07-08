package br.com.computingforum.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.computingforum.model.Answer;
import br.com.computingforum.model.Question;

public interface QuestionDao extends JpaRepository<Question, Long>{
	@Query(value="select * from questions where username=?1",nativeQuery=true)
	 List<Question> getByUser(String username);
}
