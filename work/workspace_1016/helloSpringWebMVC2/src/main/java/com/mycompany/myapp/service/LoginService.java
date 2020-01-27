package com.mycompany.myapp.service;

import com.mycompany.myapp.beans.Emp;

public interface LoginService {

	Emp getEmpno(int empNo, String eName);
	
}
