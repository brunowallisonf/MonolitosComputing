package br.com.computingforum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import br.com.computingforum.dao.UserDao;

@Controller
public class HomeController
{	@Autowired
	UserDao dao;
@GetMapping("/")
public ModelAndView index(@SessionAttribute String username)
{
	ModelAndView mv  =  new ModelAndView();
	mv.addObject("user", dao.getOne(username));
	mv.setViewName("home");
	return mv;
}
}
