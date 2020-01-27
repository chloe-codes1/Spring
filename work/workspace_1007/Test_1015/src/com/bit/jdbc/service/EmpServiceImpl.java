package com.bit.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.jdbc.dao.EmpMapper;
import com.bit.jdbc.dto.Emp;


@Service("empService")
public class EmpServiceImpl implements EmpService{

		
		@Autowired
		private EmpMapper empDao;
		

		@Override
		public Emp selectEmp(int empno) {
			Emp emp =empDao.selectEmp(empno); 
			return emp;
		}

	}

