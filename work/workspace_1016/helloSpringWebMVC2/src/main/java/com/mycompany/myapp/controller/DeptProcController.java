package com.mycompany.myapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.beans.Emp;

@Controller

@RequestMapping("/dept")
  // �긦 ������ /emp�� ���ļ� ���� ��
  // -> �̰� ��������ν� login �� ����� ���ѻ���� �����Ͽ� �����ִ� â�� �޸� �� �� ����
public class DeptProcController {

	public void mm() {
		
	}
	
	@RequestMapping("/login")
	// �׳� login�ϸ� ���� �ִ� ��ο��� ã��, /login �ϸ� webapp �ؿ� �ִ� login�� ã��
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
