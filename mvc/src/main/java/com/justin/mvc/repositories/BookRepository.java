package com.justin.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justin.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository <Book, Long> {
	List<Book> findAll();
}
