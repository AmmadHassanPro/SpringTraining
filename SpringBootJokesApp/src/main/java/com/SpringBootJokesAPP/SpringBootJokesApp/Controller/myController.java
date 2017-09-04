package com.SpringBootJokesAPP.SpringBootJokesApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringBootJokesAPP.SpringBootJokesApp.Model.myModel;
import com.SpringBootJokesAPP.SpringBootJokesApp.Service.myQuotes;

@Controller
public class myController {

	@Autowired
	public myQuotes Quotes; 
	@RequestMapping("/")
public String getQuotes(Model model) {
	
	
	
	model.addAttribute("quote",Quotes.getQuote());
	return "quote";
	
	
	
}	
}
