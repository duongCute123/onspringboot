package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonForm;

@Controller
@RequestMapping("/banhang")
public class MainController {
	private static List<Person> list = new ArrayList<Person>();
	static {
		list.add(new Person("Nguyễn Văn", "Dương"));
		list.add(new Person("Lê Văn", "Dương"));

	}
	@Value("${welcome.message}")
	private String message;

	@Value("${error.message}")
	private String errorMessage;

	@RequestMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("message", message);
		return "home";
	}

	@RequestMapping("/getList")
	public String getList(Model model) {
		model.addAttribute("lists", list);
		return "listPerson";
	}

	@RequestMapping("/addPerson")
	public String showAddPerson(Model model) {
		PersonForm form = new PersonForm();
		model.addAttribute("personForm", form);
		return "addPerson";
	}

	@RequestMapping("/addPerson")
	public String savePerson(Model model, @ModelAttribute("personForm") PersonForm personForm) {
		String firstName = personForm.getFirstName();
		String lastName = personForm.getLastName();
		if (firstName != null && lastName.length() > 0) {
			Person person = new Person(firstName, lastName);
			list.add(person);
			return "redirect:/listPerson";
		}
		model.addAttribute("errorMessage", errorMessage);
		return "addPerson";
	}
}
