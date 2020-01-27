package com.bit.gangnam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.dao.EmpMapper;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<Emp> getEmpList() {
	System.out.println("getEmpList()");
		return empMapper.getEmpList();
	}

	@Override
	public int getAllEmpCount() {
		return empMapper.getAllEmpCount();
	}

	@Override
	public Emp selectEmp(int empno) {
		return empMapper.selectEmp(empno);
	}

	@Override
	public List<Integer> getAllEmpno() {
		return empMapper.getAllEmpno();
	}

	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}

	@Override
	public List<Emp> getAllEmps() {
		return empMapper.getAllEmps();
	}

	@Override
	public void updateEmp(Emp emp) {
		empMapper.updateEmp(emp);
		
	}

	@Override
	public void deleteEmp(int empno) {
		empMapper.deleteEmp(empno);
	}
	
}
