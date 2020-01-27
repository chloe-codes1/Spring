package com.bit.gangnam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.dao.EmpMapper;

@Service("updateService")
public class UpdateServiceImpl implements UpdateService{

	
	@Autowired
	EmpMapper empMapper;
	
	
	@Override
	public Emp getEmpno(int empNo) {

		return empMapper.getEmpno(empNo);
	}


	@Override
	public int updateEmp(Emp emp) {

		return empMapper.updateEmp(emp);
	}
	
	}

