package com.bit.gangnam.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.beans.Emp;

@Controller
public class EmpFormController2 {

	private static final Logger logger = LoggerFactory.getLogger(EmpFormController2.class);

	

	@RequestMapping("emp/empform2")
	public String form(Model model) {
		model.addAttribute("emp", new Emp());

		return "emp/empform2";
	}

	
	
	
	@RequestMapping("emp/register")
		public String empRegister(Model model, @Valid Emp emp, BindingResult bindingResult) {
			
		logger.info("Binding Error => " +bindingResult.hasErrors());
		
		return "emp/empform2";
			
		}
		
}
