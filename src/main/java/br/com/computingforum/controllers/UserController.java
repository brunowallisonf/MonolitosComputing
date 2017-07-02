package br.com.computingforum.controllers;

import java.util.List;

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
import org.springframework.validation.ObjectError;
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

import br.com.computingforum.dao.AnswerDao;
import br.com.computingforum.dao.QuestionDao;
import br.com.computingforum.dao.UserDao;
import br.com.computingforum.model.Question;
import br.com.computingforum.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;
	@Autowired
	private AnswerDao ansdao;
	@Autowired
	private QuestionDao questdao;

	@PostMapping("/update")
	public String UpdateUser(@Valid @ModelAttribute("user") User user, BindingResult res, HttpServletRequest req,
			final RedirectAttributes rd) {
		if (!res.hasFieldErrors()) {
			user.setIsAdmin(false);
			String mensagem = "Usuario alterado com sucesso, Por favor faça login novamente";
			logout(req);
			rd.addFlashAttribute("sucesso",mensagem);
			return "redirect:/show-login";

		}

		rd.addFlashAttribute("erros", res.getFieldErrors());
		return "/show_user";

	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("form") User user, BindingResult res, HttpServletRequest req,
			final RedirectAttributes rd) {

		if (!res.hasFieldErrors("username") && !res.hasFieldErrors("password")) {
			User userlogin = dao.findOne(user.getUsername());
			if (userlogin != null && user.getPassword().equals(userlogin.getPassword())) {
				req.getSession().setAttribute("user", userlogin);
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
			if (!dao.exists(user.getUsername())) {
				user.setIsAdmin(false);
				rd.addFlashAttribute("sucesso", "Usuario cadastrado com sucesso");
				dao.save(user);
				return "redirect:show-login";
			} else {
				res.addError(new ObjectError("erroCriacao", "O nome usuário a ser cadastrado já existe"));
			}

		}
		rd.addFlashAttribute("erros", res.getAllErrors());
		return "redirect:/cadastro";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().removeAttribute("user"); // desvicula a secao
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

	@GetMapping("/admin/delete_user")
	public String deleteUser(@RequestParam String id) {
		List<Question> perguntas = questdao.getByUser(id);
		for (Question q : perguntas) {
			ansdao.delete(ansdao.getByQuestion(q.getQid()));
			questdao.delete(q.getQid());
		}
		dao.delete(id);
		return "redirect:/admin/show_users";
	}

	@GetMapping("/show_user")
	public ModelAndView getUser(@SessionAttribute User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", dao.getOne(user.getUsername()));
		mv.setViewName("ver_user");
		return mv;
	}

}
