
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
		 * 사원번호 입력할 수 있는 jsp 호출하는 method
		 */
	}

	@RequestMapping("/loginResult")
	// 그냥 login하면 현제 있는 경로에서 찾고, /login 하면 webapp 밑에 있는 login을 찾음
	public void loginResult(Model model, int empNo, String eName) {
		// -> Model은 Map의 역할\
		// @RequestParam("empNo")
		// -> @RequestParam은 jsp의 name과 일치시켜줘....
		/*
		 * 입력 받은 사원번호 이용해서 조회 결과를 loginResult로 보내기
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
	 * HTML 폼에 입력한 데이터를 자바 빈 객체로 전달받는 방법
	 * 
	 * @RequestMapping 어노테이션이 적용된 메소드의 파라미터에 @param 추가해주면 됨
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
		//-> return type 이 String이라서 emp/ 없이 쓰면 views/re를 찾음 => emp/ 붙여줘야함!
		//    but, void type이면 상관 없음!
		
		// => 이건 forward라서 결과가 jsp로 나온다고 하더라도 url은 호출한 애로 나옴
		//    -> data를 이어서 쓰려면 forward로 해야함!!!
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
