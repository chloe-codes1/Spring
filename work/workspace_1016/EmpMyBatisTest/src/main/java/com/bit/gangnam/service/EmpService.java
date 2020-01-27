package com.bit.gangnam.service;

import java.util.List;

import com.bit.gangnam.beans.Emp;

public interface EmpService {

	List<Emp> getEmpList();

	int getAllEmpCount();


	Emp selectEmp(int empno);

	List<Integer> getAllEmpno();

	void insertEmp(Emp emp);

	List<Emp> getAllEmps();

	void updateEmp(Emp emp);

	void deleteEmp(int empno);

}
