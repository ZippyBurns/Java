package com.justin.displaydate.controllers;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//AppRouting
@Controller
public class DateController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat clock = new SimpleDateFormat("hh;mm aa");
		model.addAttribute("time", clock.format(time));
		return "time.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat display = new SimpleDateFormat("EEEEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("date", display.format(date));
		return "date.jsp";
	}
}
