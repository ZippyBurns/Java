package com.RoutingPractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController




//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
//
//Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
//
//Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.



public class DojoController {
	@RequestMapping("/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		return "the " + dojo + " is awesome!";
	}
	
	@RequestMapping("/{burbank-dojo/}")
	public String burbank(@PathVariable("Burbank") String Burbank) {
		return Burbank + " Dojo is located in Southern California";
		
	}
	
	@RequestMapping("{/san-jose/}")
	public String sj(@PathVariable("SJ") String sj) {
		return sj + "is the headquarters";
	}
}

