package com.svinarev.form_validation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import com.svinarev.form_validation.forms.UserForm;

@Controller
public class UserController {

	@GetMapping(value = "/")
	public String getUserForm(UserForm userForm) {
		return "index";
	}
	
	@PostMapping(value = "/user")
	public String handleUserForm(@Valid UserForm userForm, 
								 BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("YES");
			return "index";
		}
		
		return "redirect:/";
	}
}
