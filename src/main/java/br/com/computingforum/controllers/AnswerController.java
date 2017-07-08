package br.com.computingforum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.com.computingforum.dao.AnswerDao;
import br.com.computingforum.dao.QuestionDao;
import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.Answer;
import br.com.computingforum.model.User;
@Controller
public class AnswerController {

	@Autowired
	private AnswerDao dao;
	@Autowired
	private QuestionDao qdao;
	@Autowired
	private UserDao udao;
	@PostMapping("/private/add_answer")
	public String addAnswer(@RequestParam("qid") Long qid, @ModelAttribute("answer") Answer answer, BindingResult res,
			@SessionAttribute("user") User user) {
		answer.setAuthor(udao.findOne(user.getUsername()));
		answer.setQuestion(qdao.getOne(qid));
		answer.setEvaluation(0);
		
		dao.save(answer);
		return "redirect:/show_question?id="+qid;
	}

}
