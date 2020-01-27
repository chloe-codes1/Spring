
package com.bit.gangnam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.gangnam.beans.Emp;
import com.bit.gangnam.service.EmpService;
import com.bit.gangnam.service.LoginService;
import com.bit.gangnam.service.UpdateService;

@Controller
@RequestMapping("/emp")
public class EmpProcController {

//	@Autowired
//	EmpMapper empMapper;

	@Autowired
	EmpService empService;

	@Autowired
	LoginService loginService;

	@Autowired
	UpdateService updateService;

	@RequestMapping("/main")
	public String main() {

		return "/main";
	}

	@RequestMapping("/login")
	public void login() {
		/*
		 * �����ȣ �Է��� �� �ִ� jsp ȣ���ϴ� method
		 */
	}

	@RequestMapping("/loginResult")
	// �׳� login�ϸ� ���� �ִ� ��ο��� ã��, /login �ϸ� webapp �ؿ� �ִ� login�� ã��
	public void loginResult(Model model, int empNo, String eName) {
		// -> Model�� Map�� ����\
		// @RequestParam("empNo")
		// -> @RequestParam�� jsp�� name�� ��ġ������....
		/*
		 * �Է� ���� �����ȣ �̿��ؼ� ��ȸ ����� loginResult�� ������
		 */

		model.addAttribute("empInfo", loginService.getEmp(empNo, eName));

	}

	@RequestMapping("/empList")
	public void empList(Model model) {
		model.addAttribute("emplist", empService.getEmpList());
	}

//	@RequestMapping("/empMapperList")
//	public void empMapperList(Model model) {
//		 model.addAttribute("list",empMapper.getEmpList());
//	}

	@RequestMapping("/empUpdate")
	public void empUpdate() {

	}

	@RequestMapping("/updateResult")
	public String updateResult(Model model, int empNo) {

		Emp result = updateService.getEmpno(empNo);
		String location = null;

		if (result != null) {
			model.addAttribute("empInfo", result);
			location = "emp/updateResult";
		} else {
			location = "emp/empUpdate";
		}
		return location;
	}

//	@RequestMapping("/update_old")
//	public String update_old(Model model, String eName, String job, int mgr, int empNo) {
//		
//		UpdateService service = new UpdateServiceImpl();
//		int result = service.updateEmp(empNo, eName, job, mgr);
//		
//		if(result ==1) {
//			model.addAttribute("updatedInfo", service.getEmpno(empNo));
//		}else {
//			model.addAttribute("updatedInfo", null);
//		}return "emp/update";
//		
//	}
	/*
	 * pdf 215
	 * 
	 * HTML ���� �Է��� �����͸� �ڹ� �� ��ü�� ���޹޴� ���
	 * 
	 * @RequestMapping ������̼��� ����� �޼ҵ��� �Ķ���Ϳ� @param �߰����ָ� ��
	 * 
	 * @param model
	 * 
	 * @param eName
	 * 
	 * @param job
	 * 
	 * @param mgr
	 * 
	 * @param empNo
	 * 
	 * @return
	 */

	@RequestMapping("/update")
	public String update(Model model, Emp emp) {

		int result = updateService.updateEmp(emp);

		if (result == 1) {
			model.addAttribute("updatedInfo", updateService.getEmpno(emp.getEmpNo()));
		} else {
			model.addAttribute("updatedInfo", null);
		}
		return "emp/update";

	}

	@RequestMapping("/re")
	public String redirectTest(Model model) {
		model.addAttribute("v", 123);
		
		return "emp/re1";
		//-> return type �� String�̶� emp/ ���� ���� views/re�� ã�� => emp/ �ٿ������!
		//    but, void type�̸� ��� ����!
		
		// => �̰� forward�� ����� jsp�� ���´ٰ� �ϴ��� url�� ȣ���� �ַ� ����
		//    -> data�� �̾ ������ forward�� �ؾ���!!!
	}

	
	@RequestMapping(value="/emp/select.do") 
	public String getEmp(@RequestParam int empno,Model model){ 
		model.addAttribute("emp",empService.selectEmp(empno));
		return"emp/select";  
	}
	
	@RequestMapping("/empform")
	public void empform() {
		
	}
	
}
