package com.bit.gangnam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.gangnam.beans.Emp;

@Controller
public class FormCommandController {
	
	
	@RequestMapping(value="empForm", method = RequestMethod.POST)
	public String empForm() {
		
		return "empForm";
	}
	
	@RequestMapping(value="empForm2", method = RequestMethod.POST)
	public String empForm2(Emp emp) {
		
		return "empForm";
	}
	
	
	@RequestMapping(value="empForm3", method = RequestMethod.POST)
	public String empForm3(Emp emp, Model model) {
		
		model.addAttribute("emp", emp);
		
		return "empForm";
	}
	
	
	
	
	@RequestMapping("/mm")
	public ModelAndView empFormView() {
		
		return new ModelAndView("mm", "emp" , new Emp());
				              //view   ${emp}
	}
	
	@RequestMapping("/mm2")
	public String empFormView2(Model model) {
		
		model.addAttribute(new Emp());
		model.addAttribute("emp2", new Emp());
		model.addAttribute("emp3", new Emp());
		
		return "mm";
	}
	
	
	


	
}
