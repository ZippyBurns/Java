package com.justin.dojoandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.justin.dojoandninjas.models.Dojo;
import com.justin.dojoandninjas.models.Ninja;
import com.justin.dojoandninjas.services.DojoService;
import com.justin.dojoandninjas.services.NinjaService;

@Controller
public class HomeController {
	@Autowired
	public DojoService dojoServ;
	@Autowired
	public NinjaService ninjaServ;
	
	@GetMapping("/dojos/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojos/new.jsp";
	}
	
	@PostMapping("/newDojo")
	public String newDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult results) {
		if (results.hasErrors()) {
			return "dojos/new.jsp";
		} else {
			dojoServ.createNewDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String createNinja(Model model,@ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> allDojos = dojoServ.getAllDojos();
		model.addAttribute("dojos", allDojos);
		return "ninjas/new.jsp";
		}

	@PostMapping("/newNinja")
	public String newNinja(Model model, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult results) {
		if (results.hasErrors()) {
			List<Dojo> allDojos = dojoServ.getAllDojos();
			model.addAttribute("dojos", allDojos);
			return "ninjas/new.jsp";
		}else {
			ninjaServ.createNewNinja(ninja);
			System.out.println(ninja);
			Long id = ninja.getDojo().getId();
			return "redirect:/dojos/Dojos/"+ id;
		}
	}
	
	@GetMapping("/dojos/Dojos/{id}")
	public String dojos(Model model, @PathVariable("id")Long id) {
		Dojo dojo = dojoServ.getDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojos/Dojos.jsp";
	}
	
	
	
}
	


