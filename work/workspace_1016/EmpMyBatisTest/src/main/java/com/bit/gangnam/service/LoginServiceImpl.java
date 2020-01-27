package com.bit.gangnam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.dao.EmpMapper;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	EmpMapper empMapper;

	@Override
	public Emp getEmp(int empNo, String eName) {
		
		return empMapper.getEmp(empNo, eName);
	}
	

}
