package com.marlabs.bala;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {
	
	@Autowired
	BookService bookservice;
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Book> listBooks = bookservice.listAll();
		model.addAttribute("listBooks", listBooks);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewBook(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		
		return "new_book";
	}
	

}
