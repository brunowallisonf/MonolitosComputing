package br.com.computingforum.controllers;


import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import br.com.computingforum.dao.QuestionDao;
import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.User;

@Controller
public class HomeController
{	@Autowired
	UserDao dao;
@Autowired QuestionDao qdao;
@GetMapping("/")
public ModelAndView index(@SessionAttribute(required=false) User user)
{
	ModelAndView mv  =  new ModelAndView();
	if(user!=null){
		mv.addObject("user", dao.getOne(user.getUsername()));
	}
	mv.setViewName("home");
	mv.addObject("questions", qdao.findAll());
	return mv;
}
}
