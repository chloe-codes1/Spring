package com.mycompany.myapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public void sss(HttpServletRequest request) { }
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		model.addAttribute("serverTime", formattedDate );
		// -> request.setAttribute 같은것
		// -> key / value로 Object Type이 올 수 있다
		
		return "home";
		 // -> WEB-INF/views/home
	}
	
	@RequestMapping("/test")
	public ModelAndView methodCallTest() {
		
		EmpService service = new EmpServiceImpl();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("dept/empList");
		mav.addObject("emplist", service.getEmpList());
		
		return mav;
	}
	
}
