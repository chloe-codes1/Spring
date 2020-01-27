package com.bit.gangnam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.dao.EmpMapper;
import com.bit.gangnam.service.EmpService;

@Controller

@RequestMapping("/emp")
  // �긦 ������ /emp�� ���ļ� ���� ��
  // -> �̰� ��������ν� login �� ����� ���ѻ���� �����Ͽ� �����ִ� â�� �޸� �� �� ����
public class EmpProcController {

	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	EmpService empService;
	
	
	@RequestMapping("/empList")
	public void empList(Model model) {
		//-> void�ϸ� @RequestMapping�� �̸��� ������ jsp (in views)�� ã�´�~
		
		model.addAttribute("list", empService.getEmpList());
	}
	
	@RequestMapping("/empMapperList")
	public void empMapperList(Model model) {
		//-> void�ϸ� @RequestMapping�� �̸��� ������ jsp (in views)�� ã�´�~
		
		model.addAttribute("list", empMapper.getEmpList());
	}
}


