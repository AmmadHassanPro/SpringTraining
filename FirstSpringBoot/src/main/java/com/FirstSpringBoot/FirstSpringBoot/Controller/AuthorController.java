package com.FirstSpringBoot.FirstSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FirstSpringBoot.FirstSpringBoot.Repo.AuthorRepo;

@Controller
public class AuthorController {
	
	private AuthorRepo author_repo;

	public AuthorController(AuthorRepo author_repo) {
		super();
		this.author_repo = author_repo;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		
		model.addAttribute("authors", author_repo.findAll());
		
		return "authors";
		
		
		
		
	}
	

}
