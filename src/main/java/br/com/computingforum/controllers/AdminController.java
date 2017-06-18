package br.com.computingforum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.computingforum.dao.QuestionDao;
import br.com.computingforum.dao.UserDao;
@Controller
public class AdminController {
	@Autowired
	private  UserDao userdao;
	
	@Autowired
	private QuestionDao questionDao;
	
	@GetMapping("/admin/show_panel")
	public ModelAndView showPanel(){
		ModelAndView mv =  new ModelAndView();
		mv.addObject("users", userdao.findAll());
		mv.addObject("questions", questionDao.findAll());
		mv.setViewName("admin/painel_admin");
		return mv;
	}
	
	@GetMapping("/admin/show_users")
	public ModelAndView showUsers(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", userdao.findAll());
		mv.setViewName("/admin/show_users");
		return mv;
	}
	
	@GetMapping("/admin/show_questions")
	public ModelAndView showQuestions(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("questions",questionDao.findAll());
		mv.setViewName("/admin/show_questions");
		return mv;
	}
}	
