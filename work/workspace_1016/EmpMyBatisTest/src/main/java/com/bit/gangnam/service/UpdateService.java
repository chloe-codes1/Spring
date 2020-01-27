package com.bit.gangnam.service;

import com.bit.gangnam.beans.Emp;

public interface UpdateService {
	
	public Emp getEmpno(int empNo);
	
	public int updateEmp(Emp emp);
	
}
