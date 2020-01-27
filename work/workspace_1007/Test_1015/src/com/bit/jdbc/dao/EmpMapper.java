package com.bit.jdbc.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bit.jdbc.dto.Emp;

@Service
public interface EmpMapper {

	Emp selectEmp(@Param("en")int empno);
	
}
