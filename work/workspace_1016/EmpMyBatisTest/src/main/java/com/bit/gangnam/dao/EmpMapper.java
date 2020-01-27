package com.bit.gangnam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bit.gangnam.beans.Emp;

@Service
public interface EmpMapper {
	
	List<Emp> getEmpList();
	
	Emp getEmp(@Param("empNo") int empNo, @Param("eName") String eName);
	
	Emp getEmpno(int empNo);
	
	int updateEmp(Emp emp);
	
	int getAllEmpCount();

	Emp selectEmp(int empno);

	List<Integer> getAllEmpno();

	void insertEmp(Emp emp);

	List<Emp> getAllEmps();

	void deleteEmp(int empno);
	
	
}
