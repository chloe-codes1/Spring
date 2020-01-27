package com.spring.board.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.board.beans.User;


@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("user/formView")
	public String form(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user/form";
	}
	
	
	@RequestMapping("user/register")
	public String userRegister(Model model, @Valid User user, BindingResult bindingResult) {
							// -> user는 여기서 Command 객체라서 Validation 대상이란걸 @Valid로 알려줘야함
		
		logger.info("Binding Error => " +bindingResult.hasErrors());
									// -> bindingResult는 Validation결과를 갖고있음
		
		return "user/form";
	}
	
	
}
