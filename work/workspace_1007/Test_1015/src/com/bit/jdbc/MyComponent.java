package com.bit.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.dto.Emp;

@Component
public class MyComponent {
	@Autowired
	private EmpMapper empMapper;

	public void selectEmpResult(int empNo) {
		
		Emp emp = empMapper.selectEmp(empNo);
		System.out.println("사원명 : " + emp.geteName() + "  |  MGR : " + emp.getMgr());
	}
}
