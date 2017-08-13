package com.FirstSpringBoot.FirstSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FirstSpringBoot.FirstSpringBoot.Repo.BookRepo;

@Controller
public class BookController {

	private BookRepo book_repo;
	public BookController(BookRepo book_repo) {
		
		this.book_repo = book_repo;
	}
	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", book_repo.findAll());
		return "books";
	}
	
	
	
}
