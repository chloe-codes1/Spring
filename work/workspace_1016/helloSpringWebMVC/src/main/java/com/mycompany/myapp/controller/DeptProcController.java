package com.mycompany.myapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;

@Controller

@RequestMapping("/dept")
  // 얘를 넣으면 /emp를 거쳐서 들어가게 됨
  // -> 이걸 사용함으로써 login 한 사람과 안한사람을 구분하여 보여주는 창을 달리 할 수 있음
public class DeptProcController {

	List<Emp> emps;
	
	
	public void mm() {
		
	}
	
	@RequestMapping("/login")
	// 그냥 login하면 현재 있는 경로에서 찾고, /login 하면 webapp 밑에 있는 login을 찾음
	public void login() {
		
	}
	
	@RequestMapping("empList")
	public void empList(Model model) {
		// emp를 넘겨 줘야하니까 Emp Table과 속성이 같은 class 필요  => emp class 만들어!
		// SQL을 실행할 것이 필요  => DBConnection 호출
		// emp 목록을 jsp에 전달한다
		
		EmpService service = new EmpServiceImpl();
		
		model.addAttribute("emplist", service.getEmpList());
		
	}
	
	
	
	@RequestMapping(value = "/login2", method = RequestMethod.POST)
	public String empsInsert(List<Emp> emps, Model model) {
		
		System.out.println(emps);
		
		model.addAttribute("emps", emps);
		return "dept/empList";
	}
	
	
}
