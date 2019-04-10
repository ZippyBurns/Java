package com.justin.code;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@RequestMapping (value="/process", method=RequestMethod.POST)
	public String survey(@RequestParam(value="name")String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comments") String comments, HttpSession session){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comments", comments);
		
		return "redirect:/results";
	}
	
	@RequestMapping ("/results")
	public String results(HttpSession session) {
		session.getAttribute("name");
		session.getAttribute("location");
		session.getAttribute("langauge");
		session.getAttribute("comments");
		return "results.jsp";
	
	}
	
	
	
}

