package br.com.computingforum.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	@GetMapping("/login")
	public String login (HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username != null){
			return "erro_autenticacao";
		}
		User user = dao.findOne(username);
		if (user.getPassword().equals(password)){
			request.setAttribute("username", user.getUsername());
		}
		return "/";
	}
	
	@GetMapping("/cadastro")
	public String createUser(@RequestBody  User user){
		dao.save(user);
		return "login";
	}
	
}
