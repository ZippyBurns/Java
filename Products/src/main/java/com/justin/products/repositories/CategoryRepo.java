package com.justin.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.justin.products.models.Category;

public interface CategoryRepo extends CrudRepository <Category, Long> {
	List<Category> findAll();
}
