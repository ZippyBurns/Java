package com.justin.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justin.dojoandninjas.models.Dojo;
import com.justin.dojoandninjas.repositories.DojoRepo;

@Service
public class DojoService {
	@Autowired
	public DojoRepo dojoRepo;
	
	public Dojo createNewDojo(Dojo b) {
		return dojoRepo.save(b);
	}

	public List<Dojo> getAllDojos() {
		// TODO Auto-generated method stub
		return dojoRepo.findAll();
	}

	  public Dojo getDojo(Long id) {
		Optional<Dojo> getinfo = dojoRepo.findById(id);
			if(getinfo.isPresent()) {
				Dojo newInfo = getinfo.get();
				System.out.println(newInfo);
				return newInfo;
			}else {
				return null;
			}
			
			
	}


}
