package com.justin.authentications.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.justin.authentications.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long>{
	
	User findByEmail(String email);

}
