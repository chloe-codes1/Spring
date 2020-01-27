package com.mycompany.myapp.contr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;

@Controller
@RequestMapping("/emp")
public class EmpProcController {
	
	EmpService service = new EmpServiceImpl();
	
	public void mm() {
		
	}
	
	@RequestMapping("/empMain")
	public void empMain() {  
		
	}
	
	@RequestMapping("/login")
	public void login() {  //empNo를 입력할 수 있는 jsp호출하는 메소드
		
	}
	
	
	@RequestMapping("/loginResult")
	public void loginResult(Model model, int empNo) {
		//입력받은 empNo로 조회  => 결과를 loginResult로 보냄
		Emp emp = service.getEmp(empNo);
		if(emp.getEmpNo()==0) {
			model.addAttribute("emp", null);
		}else {
			model.addAttribute("emp", service.getEmp(empNo));
		}
	}
	
	
	@RequestMapping("/empUpdate")
	public void empUpdate() {  
		
	}
	
	
	@RequestMapping("/updateSelect")
	public String updateSelect(Model model, int empNo) {
		//입력받은 empNo로 조회  => 결과를 loginResult로 보냄
		
		model.addAttribute("emp", service.getEmp(empNo));
		
		return "emp/empUpdate";
	}
	
	@RequestMapping("/updateEmp")
	public String updateEmp(Model model, String eName, String job, int mgr, int empNo) { 		
		//사원정보변경
		
		int updateResult = service.updateEmp(eName, job, mgr, empNo);
		
		if(updateResult==1) {
			model.addAttribute("list", service.getEmpList());
			return "emp/empUpdate";
		}else {
			model.addAttribute("list", null);
		}
		return "emp/empUpdate";
	}
	


	@RequestMapping("/empList")
	public void empList(Model model) {
		//emp table 과 속성이 같은 클래스가 필요
		//sql 실행 필요  => EmpOldDao
		//emp목록을 jsp에 전달
		
		//DBConnection dao;
		
		model.addAttribute("list", service.getEmpList());
		
	}
	
	
}
