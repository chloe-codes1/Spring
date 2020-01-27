package com.mycompany.myapp.service;

import com.mycompany.myapp.beans.Emp;

public interface UpdateService {

	Emp getEmpno(int empNo);
	
	int updateEmp(int empNo, String eName, String job, int mgr);

	int updateEmp(Emp emp);
	
}
