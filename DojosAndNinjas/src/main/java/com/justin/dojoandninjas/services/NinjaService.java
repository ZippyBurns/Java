package com.justin.dojoandninjas.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justin.dojoandninjas.models.Ninja;
import com.justin.dojoandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	@Autowired
	public NinjaRepo ninjaRepo;

	public Ninja createNewNinja(@Valid Ninja ninja) {
		return ninjaRepo.save(ninja);
		
	}
}
