package com.bit.gangnam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.gangnam.dao.EmpMapper;
import com.bit.gangnam.service.EmpService;

@Controller

@RequestMapping("/emp")
  // 얘를 넣으면 /emp를 거쳐서 들어가게 됨
  // -> 이걸 사용함으로써 login 한 사람과 안한사람을 구분하여 보여주는 창을 달리 할 수 있음
public class EmpProcController {

	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	EmpService empService;
	
	
	@RequestMapping("/empList")
	public void empList(Model model) {
		//-> void하면 @RequestMapping의 이름과 동일한 jsp (in views)를 찾는다~
		
		model.addAttribute("list", empService.getEmpList());
	}
	
	@RequestMapping("/empMapperList")
	public void empMapperList(Model model) {
		//-> void하면 @RequestMapping의 이름과 동일한 jsp (in views)를 찾는다~
		
		model.addAttribute("list", empMapper.getEmpList());
	}
}


