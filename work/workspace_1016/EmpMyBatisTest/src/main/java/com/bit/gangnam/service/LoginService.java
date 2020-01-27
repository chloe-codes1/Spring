package com.bit.gangnam.service;

import com.bit.gangnam.beans.Emp;

public interface LoginService {

	Emp getEmp(int empNo, String eName);
	
}
