package com.justin.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		System.out.println("HEMOS LLEGADO EN LA CASA");
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String guess(@RequestParam(value="code") String code) {
		System.out.println("HEMOS LLEGADO EN EL METHOD DE PROCESSO");
		if (code.equals("bushido")) {
			return "redirect:/code";
		}
		else {
			return "redirect:/createError";
		}	
	}
	
	@RequestMapping("/code")
	public String code() {
		System.out.println(" Y aqui es el codigo");
		return "code.jsp";
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train HARDER!!!");
	
		return "redirect:/";
	}
	
}

