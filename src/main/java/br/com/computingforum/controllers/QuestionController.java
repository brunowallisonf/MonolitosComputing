package br.com.computingforum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.computingforum.model.category;

@Controller
public class QuestionController {
	
	@PostMapping("/addquestion")
	public String createQuestion(){
		
		return "redirect: /";
		
	}
	@GetMapping("/fazer-pergunta")
	public String show(){
		Model model = null;
		model.addAttribute("categories", category.values());
		return "add_pergunta";
	}
}
