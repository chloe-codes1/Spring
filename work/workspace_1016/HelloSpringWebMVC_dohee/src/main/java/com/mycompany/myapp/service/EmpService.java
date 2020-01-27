package com.mycompany.myapp.service;

import java.util.List;

import com.mycompany.myapp.beans.Emp;

public interface EmpService {
	
	List<Emp> getEmpList();
	Emp getEmp(int empNo);
	int updateEmp(String eName, String job, int mgr, int empNo);
	
}
