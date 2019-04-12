package controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Author;
import model.AuthorText;
import service.ServiceAuthorText;
import service.ServiceDao;

/**
 * @author payalabichandani
 *
 */
@Controller
public class AuthorController {
	@Autowired
	private ServiceDao service;
	@Autowired
	private ServiceAuthorText serviceAuthorText;

	@GetMapping("/")
	public String Home() {

		return "home";
	}

	@GetMapping("/author")
	public String Author(Locale locale, Model model) {
		model.addAttribute("author", new Author());
		model.addAttribute("authors", service.listAuthor());
		return "author";

	}

	@PostMapping("/addAuthor")
	public String addAuthor(@Valid @ModelAttribute("author") Author author, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("error", "Cannot add the author");

			return "error";
		}
		service.addAuthor(author);
		return "redirect:/author";
	}

	@GetMapping("/authorpage")
	public String authorPage() {

		return "AddAuthor";
	}

	@GetMapping("{id}/delete")
	public String deleteAuthor(@PathVariable("id") Long id) {	
		Author author = service.getAuthor(id);
		service.deleteAuthor(author);
		return "redirect:/author";
	}

	@GetMapping("{id}/openAuthor")
	public String openAuthor(@PathVariable("id") Long id, Model model) {	
		Author author = service.getAuthor(id);
		model.addAttribute("author", author);
		return "updateAuthor";
	}

	@PostMapping("{id}/editAuthor")
	public String editAuthor(@Valid @ModelAttribute("author") Author author, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("authors", service.listAuthor());
			return "author";
		}
		service.updateAuthor(author);
		return "redirect:/author";
	}

	@GetMapping("/LoginAuthor")
	public String login() {

		return "loginAuthor";
	}

	@PostMapping("/Login")
	public String loginAuthor(@Valid @ModelAttribute("author") Author author, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("error", "No Author Found");
			return "error";
		}

		Author au = null;
		au = service.getAuthor(author.getId());
		if (au == null) {
			model.addAttribute("error", "No Author Found");
			return "error";

		} else {
			model.addAttribute("author", au);
			List<AuthorText> list = serviceAuthorText.listTextsbyAuthorId(au.getId());
			model.addAttribute("authortextslist", list);			
			return "authoraccount";
		}

	}

	@PostMapping("{id}/entertext")
	public String textPage(@PathVariable("id") Long aut_id, Model model) {

		model = setAuthor(model, aut_id);
		return "addtext";
	}

	@PostMapping("{id}/addtext")
	public String addText(@Valid @ModelAttribute("authortext") AuthorText authortext, BindingResult result,
			@PathVariable("id") Long aut_id, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("error", result.getFieldError());
			return "error";
		}

		authortext.setAut_id(aut_id);
		serviceAuthorText.addAuthorText(authortext);
		model = setAuthor(model, aut_id);
		return "addtext";
	}

	@GetMapping("{aut_id}/deletetext/{id}")
	public String deleteAuthorText(@PathVariable("id") Long id, @PathVariable("aut_id") Long aut_id, Model model) {
    	AuthorText authortext = serviceAuthorText.getAuthorText(id);
		serviceAuthorText.deleteAuthorText(authortext);
		model = setAuthor(model, aut_id);
		return "redirect:/{aut_id}/entertext";
	}

	@GetMapping("{id}/entertext")
	public String manageText(@PathVariable("id") Long aut_id, Model model) {
 	model = setAuthor(model, aut_id);
		return "addtext";
	}

	public Model setAuthor(Model model, Long aut_id) {
		model.addAttribute("authortext", new AuthorText());
		model.addAttribute("authortextslist", serviceAuthorText.listTextsbyAuthorId(aut_id));
		return model;
	}

}
