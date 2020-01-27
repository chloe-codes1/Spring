package com.mycompany.myapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.beans.Emp;

@Controller

@RequestMapping("/dept")
  // 얘를 넣으면 /emp를 거쳐서 들어가게 됨
  // -> 이걸 사용함으로써 login 한 사람과 안한사람을 구분하여 보여주는 창을 달리 할 수 있음
public class DeptProcController {

	public void mm() {
		
	}
	
	@RequestMapping("/login")
	// 그냥 login하면 현재 있는 경로에서 찾고, /login 하면 webapp 밑에 있는 login을 찾음
	public void login() {
		
	}
//	
//	@RequestMapping(value = "/empsInsert", method = RequestMethod)
//	public String empsInsert(List<Emp> emps, Model model) {
//		
//		System.out.println(emps);
//		model.addAttribute("emps", emps);
//		return "dept/empList";
//	}
	
	
}
