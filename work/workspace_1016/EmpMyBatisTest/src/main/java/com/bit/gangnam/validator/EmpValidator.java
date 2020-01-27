package com.bit.gangnam.validator;


import java.sql.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bit.gangnam.beans.Emp;

public class EmpValidator implements Validator {

	private Emp emp;

	@Override
	public boolean supports(Class<?> clazz) {
						//clazz �׳� �����ϰ� ������ ��������
		
		boolean b =Emp.class.isAssignableFrom(clazz);
		System.out.println("supports => " + b);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		emp = (Emp) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empNo", "required", "Fieldisrequired.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "eName", "required", "Fieldisrequired.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "job", "required", "Fieldisrequired.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mgr", "required", "Fieldisrequired.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hiredate", "required", "Fieldisrequired.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sal", "required", "Fieldisrequired.");
			// -> ���⿡ �ִ� empNo, eName, ... ����� Emp Class�� getempNo, setempNo �̹Ƿ� ������ ���������!
		
		
		
		System.out.println(emp);
		
		if (isValidSal(emp.getSal())) {
			errors.rejectValue("sal", "required", "�޿��� 0���� Ŀ�� �մϴ�.");
		}
		if (!isValidHiredate(emp.getHiredateStr())) {
			errors.rejectValue("hiredateStr", "required", "��¥ ����(YYYY-MM-DD)�� ���� �ʽ��ϴ�.");
		}

	}

	private boolean isValidSal(double value){ 
		if(value<0){ 
			return true; 
			} 
			return false; 
			}

	private boolean isValidHiredate(String date){ 
		try{ 
			Date hiredate =Date.valueOf(date); 
			
			System.out.println(date);
			
			emp.setHiredate(hiredate); 
			return true; 
		}catch(IllegalArgumentException e){ 
			return false; 
			} 
		} 
	}

