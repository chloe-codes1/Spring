package com.bit.gangnam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.service.EmpService;
import com.bit.gangnam.validator.EmpValidator;

@Controller
@RequestMapping("/emp/insert.do")
public class EmpFormController {

	@Autowired
	private EmpService empService;


	@RequestMapping(method = RequestMethod.GET)
	public String form(@ModelAttribute("emp") Emp emp) {
					//-> ModelAttribute ��� ���� ��!
		
		return "emp/empform";
	}

	
	
	@ModelAttribute("emp")
	//���⿡ annotation���� @ModelAttribute("emp")���� �˷���� ������ formBacking�� ����Ǵ� ��!
		// -> "emp"�� instance�� ���� reference
		//     => Instance �޾Ƽ� ó������� �Ҷ� �̷������� ����� ��!
	public Emp formBacking(HttpServletRequest request) {
		//-> ���⼭�� Emp instance ������ִ� ����
		
		System.out.println("formBacking");
		Emp emp = new Emp();
		String empnoStr = request.getParameter("empNo");
		if (empnoStr != null) {
			int empno = Integer.parseInt(empnoStr);
			emp = empService.selectEmp(empno);
			request.setAttribute("emp", emp);
		}
		if (request.getMethod().equalsIgnoreCase("GET")) {
			emp.setEmpnoList(empService.getAllEmpno());
		}
		return emp;
	}

	@RequestMapping(method = RequestMethod.POST)

	public String submit(@Valid Emp emp, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.toString());
			return "emp/empform";
		} 
		return "emp/empformResult";
		
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		/*
		 * binder�� ���� EmpValidator�� ȣ���ϴ� ����
		 */
		
		System.out.println("inditBinder");
		binder.setValidator(new EmpValidator());

	}

}
