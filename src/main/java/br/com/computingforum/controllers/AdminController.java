package br.com.computingforum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.computingforum.dao.AnswerDao;
import br.com.computingforum.dao.QuestionDao;
import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.Question;
import br.com.computingforum.model.User;

@Controller
public class AdminController {
	@Autowired
	private UserDao userdao;

	@Autowired
	private QuestionDao questionDao;

	@Autowired
	private AnswerDao ansdao;

	@GetMapping("/admin/show_panel")
	public ModelAndView showPanel() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", userdao.findAll());
		mv.addObject("questions", questionDao.findAll());
		mv.setViewName("admin/painel_admin");
		return mv;
	}

	@GetMapping("/admin/show_users")
	public ModelAndView showUsers() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", userdao.findAll());
		mv.setViewName("/admin/show_users");
		return mv;
	}

	@GetMapping("/admin/show_questions")
	public ModelAndView showQuestions() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("questions", questionDao.findAll());
		mv.setViewName("/admin/show_questions");
		return mv;
	}

	@GetMapping("/admin/delete_user")
	public String deleteUser(@RequestParam String id) {
		List<Question> perguntas = questionDao.getByUser(id);
		for (Question q : perguntas) {
			ansdao.delete(ansdao.getByQuestion(q.getQid()));
			questionDao.delete(q.getQid());
		}
		userdao.delete(id);
		return "redirect:/admin/show_users";
	}

	@GetMapping("/admin/make_admin")
	public String makeAdmin(@RequestParam String id) {
		User user = userdao.getOne(id);
		if (user != null) {
			user.setIsAdmin(true);
			userdao.save(user);
		}

		return "redirect:/admin/show_users";

	}
}
