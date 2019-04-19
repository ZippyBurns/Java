package com.justin.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.justin.products.models.CategoryProduct;

public interface CategoryProductRepo extends CrudRepository <CategoryProduct, Long> {
		List<CategoryProduct> findAll();
	}

