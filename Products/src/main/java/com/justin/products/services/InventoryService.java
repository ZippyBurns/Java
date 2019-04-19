package com.justin.products.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.justin.products.models.Category;
import com.justin.products.models.CategoryProduct;
import com.justin.products.models.Product;
import com.justin.products.repositories.CategoryProductRepo;
import com.justin.products.repositories.CategoryRepo;
import com.justin.products.repositories.ProductRepo;

@Repository
public class InventoryService {
	@Autowired
	public ProductRepo pR;
	@Autowired
	public CategoryRepo cR;
	@Autowired
	public CategoryProductRepo cpR;
	
	
	public Product createNewProduct(@Valid Product p) {
		return pR.save(p);
	}
	public Product getOneProduct(Long id) {
		Optional<Product> prod = pR.findById(id);
		if (prod.isPresent()) {
			return prod.get();
		}else {
			
		return null;
		}
	}
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return cR.findAll();
	}
	
	
	public void addOneCategory(CategoryProduct cP) {
		cpR.save(cP);
		
	}


	



	
	

}
