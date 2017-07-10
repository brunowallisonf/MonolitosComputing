package br.com.computingforum.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.computingforum.model.Answer;
import br.com.computingforum.model.User;

public interface AnswerDao extends JpaRepository<Answer, Long> {
	@Query(value="select * from answers where qid=?1",nativeQuery=true)
	 List<Answer> getByQuestion(Long id);
	
	List<Answer> findByAuthor(User u);
}
