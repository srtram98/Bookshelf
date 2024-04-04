package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Book;
import dmacc.repository.BookRepository;
import jakarta.validation.Valid;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 28, 2024
 */
@Controller
public class WebController {
	@Autowired
	BookRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllBooks(Model model) {
		
		if(repo.findAll().isEmpty()) {
			return addNewBook(model);
		}
		
		model.addAttribute("books", repo.findAll());
		return "viewAllBooks";
	}
	
	@GetMapping("/addBook")
	public String addNewBook(Model model) {
		
		Book b = new Book();
		model.addAttribute("newBook", b);
		return "addNewBook";
	}
	
	@PostMapping("/inputBook")
	public String addNewBook(@Valid Book b, Errors errors, Model model) {
		
		if(null != errors && errors.getErrorCount() > 0) {
			model.addAttribute("newBook", b);
			return "addNewBook";
		}
		repo.save(b);
		return viewAllBooks(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateBook(@PathVariable("id") long id, Model model) {
		
		Book b = repo.findById(id).orElse(null);
		model.addAttribute("updateBook", b);
		return "updateBook";
	}
	
	@PostMapping("/update/{id}")
	public String updateBook(Book b, Model model) {
		
		repo.save(b);
		return "redirect:/viewAll";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		
		Book b = repo.findById(id).orElse(null);
		repo.delete(b);
		return "redirect:/viewAll";
	}
}


