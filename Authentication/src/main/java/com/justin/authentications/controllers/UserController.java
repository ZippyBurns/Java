package com.justin.authentications.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.justin.authentications.models.User;
import com.justin.authentications.services.UserService;
import com.justin.authentications.validations.UserValidator;



@Controller
public class UserController {
    private final UserService userService;
    
private final UserValidator userValidator;
    
    // NEW
    public UserController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
   

@RequestMapping("/registration")
public String registerForm(@ModelAttribute("user") User user) {
    return "registrationPage.jsp";
}
@RequestMapping("/login")
public String login() {
    return "loginPage.jsp";
}

@RequestMapping(value="/registration", method=RequestMethod.POST)
public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	userValidator.validate(user,result);
	System.out.println(result);
	if (result.hasErrors()) {
		return "registrationPage.jsp";
		// else, save the user in the database, save the user id in session, and redirect them to the /home route
	}else {
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/home";
	}
}

@RequestMapping(value="/login", method=RequestMethod.POST)
public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
	boolean auth = userService.authenticateUser(email, password);
		if(auth) {
			User user = userService.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/home";
		}
	
		else { 
			String error = "Unsucessful login";
			model.addAttribute("error", error);
				return "loginPage.jsp";
			
		}
}

@RequestMapping("/home")
public String home(HttpSession session, Model model) {
	Long userId = (Long)session.getAttribute("userId");
	User user = userService.findUserById(userId);
	model.addAttribute("user", user);
	return "homePage.jsp";
}
@RequestMapping("/logout")
public String logout(HttpSession session) {
    session.invalidate();
    return "redirect:/login";
}
}
