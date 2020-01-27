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
						//clazz 그냥 랜덤하게 지정한 변수명임
		
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
			// -> 여기에 있는 empNo, eName, ... 등등은 Emp Class의 getempNo, setempNo 이므로 변수명 맞춰줘야함!
		
		
		
		System.out.println(emp);
		
		if (isValidSal(emp.getSal())) {
			errors.rejectValue("sal", "required", "급여는 0보다 커야 합니다.");
		}
		if (!isValidHiredate(emp.getHiredateStr())) {
			errors.rejectValue("hiredateStr", "required", "날짜 형식(YYYY-MM-DD)에 맞지 않습니다.");
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

