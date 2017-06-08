package br.com.computingforum.controllers;

import javax.jws.WebMethod;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Pattern;
import javax.validation.executable.ValidateOnExecution;

import org.hibernate.validator.valuehandling.UnwrapValidatedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;
	
	@PostMapping("/login")
	public String login (HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username == null || password==null){
			return "tela_login";
		}
		User user = dao.findOne(username);
		if(user == null|| user.getPassword() == null || user.getUsername()==null){
			return "tela_login";
		}
		if (user.getPassword().equals(password)){
			request.getSession().setAttribute("username", user.getUsername());
			return "redirect:/";
		}
		return "tela_login";
	}
	
	
	@PostMapping("/cadastrar")
	public String createUser( @ModelAttribute("form")  User user){
		user.setIsAdmin(false);
		dao.save(user);
		return "tela_login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("username"); // desvicula a secao do usuario
		return "tela_login";
	}
	
//	@GetMapping("/")
//	public String index(){
//		
//		
//		
//	}
//	
}
