package com.FirstSpringBoot.FirstSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FirstSpringBoot.FirstSpringBoot.Repo.BookRepo;

@Controller
public class BookController {

	private BookRepo book_repo;
	@RequestMapping("/books")
	public String getBooks(Model model) {
	
		
		
		return null;
	}
	
	
	
}
