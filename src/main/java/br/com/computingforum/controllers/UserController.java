package br.com.computingforum.controllers;

import javax.jws.WebMethod;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.executable.ValidateOnExecution;

import org.hibernate.validator.valuehandling.UnwrapValidatedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao dao;

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("form") User user, BindingResult res, HttpServletRequest req,
			final RedirectAttributes rd) {

		if (!res.hasFieldErrors("username") && !res.hasFieldErrors("password")) {
			User userlogin = dao.findOne(user.getUsername());
			if (userlogin != null && user.getPassword().equals(userlogin.getPassword())) {
				req.getSession().setAttribute("username", userlogin.getUsername());
				return "redirect:/";
			}
		}
		String errmessage = "Usuario e/ou senha incorretos";
		rd.addFlashAttribute("erro", errmessage);

		return "redirect:/show-login";
	}

	@PostMapping("/cadastrar")
	public String createUser(@Valid @ModelAttribute("form") User user, BindingResult res, HttpServletRequest req,
			final RedirectAttributes rd) {
		if (!res.hasFieldErrors()) {
			user.setIsAdmin(false);
			rd.addFlashAttribute("sucesso", "Usuario cadastrado com sucesso");
			dao.save(user);
			return "redirect:show-login";
		}
		rd.addFlashAttribute("erros",res.getFieldErrors());
		return "redirect:/cadastro";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("username"); // desvicula a secao
															// do usuario
		return "redirect:/";
	}

	@GetMapping("/show-login")
	public ModelAndView showLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("form", new User());
		mv.setViewName("tela_login");
		return mv;
	}

	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cadastro");
		mv.addObject("form", new User()); // novo usuario que sera preenchido
		return mv;
	}

}
