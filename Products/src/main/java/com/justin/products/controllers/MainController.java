package com.justin.products.controllers;

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

import com.justin.products.models.Category;
import com.justin.products.models.CategoryProduct;
import com.justin.products.models.Product;
import com.justin.products.services.InventoryService;

@Controller
public class MainController {
	@Autowired
	public InventoryService iS;
	
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("productObj")Product p) {
		
		return"products/New.jsp";
	}

	@PostMapping("/newProduct")
	public String createProduct(@Valid @ModelAttribute("productObj")Product p, BindingResult results) {
		if(results.hasErrors()) {
			return "products/New.jsp";
		} else {
			Product newProd = iS.createNewProduct(p);
			Long id = newProd.getId();
			return "redirect:/showProduct/"+ id;
		}
	}
	
	@GetMapping("/showProduct/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id, @ModelAttribute("midTableObj") CategoryProduct cP) {
		Product showProd = iS.getOneProduct(id);
		model.addAttribute("product", showProd);
		System.out.println(showProd.getCategories());
		
		List<Category> allCategories = iS.getAllCategories();
		model.addAttribute("allCategories", allCategories);
		return "/products/showProduct.jsp";
	}
	
	@PostMapping("/addCategory")
	public String createCategory(@Valid @ModelAttribute("midTableObj") CategoryProduct cP, BindingResult results) {
		if (results.hasErrors()) {
			System.out.println("Add errors");
			return "/products/showProduct.jsp";
		}else {
			iS.addOneCategory(cP);
			System.out.println("Add category success");
			return "redirect:/showProduct/" + cP.getProduct().getId();		
		}
	}
	
}
