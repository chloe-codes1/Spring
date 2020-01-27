package com.bit.gangnam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.dao.EmpMapper;


//내가 empService라고 알려주기
@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpMapper empMapper;
	
	
	@Override
	public List<Emp> getEmpList() {
		return empMapper.getEmpList();
	}

}
