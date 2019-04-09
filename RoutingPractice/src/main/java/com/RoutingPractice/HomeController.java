package com.RoutingPractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.

//'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.

//'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.

@RestController
public class HomeController {
	@RequestMapping("/")
	public String practice() {
		return "Time to practice routing!";
	}
	
	@RequestMapping("/coding")
	public String dojo() {
		return "Hello CodingDojo";
	}
	
	@RequestMapping("coding/python")
	public String python() {
		return "Python/Django was AWESOME!";
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}
