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
  // �긦 ������ /emp�� ���ļ� ���� ��
  // -> �̰� ��������ν� login �� ����� ���ѻ���� �����Ͽ� �����ִ� â�� �޸� �� �� ����
public class DeptProcController {

	List<Emp> emps;
	
	
	public void mm() {
		
	}
	
	@RequestMapping("/login")
	// �׳� login�ϸ� ���� �ִ� ��ο��� ã��, /login �ϸ� webapp �ؿ� �ִ� login�� ã��
	public void login() {
		
	}
	
	@RequestMapping("empList")
	public void empList(Model model) {
		// emp�� �Ѱ� ����ϴϱ� Emp Table�� �Ӽ��� ���� class �ʿ�  => emp class �����!
		// SQL�� ������ ���� �ʿ�  => DBConnection ȣ��
		// emp ����� jsp�� �����Ѵ�
		
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
