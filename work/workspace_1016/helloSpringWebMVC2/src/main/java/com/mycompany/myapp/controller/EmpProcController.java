package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.beans.Emp;
import com.mycompany.myapp.dao.DBConnection;
import com.mycompany.myapp.service.EmpService;
import com.mycompany.myapp.service.EmpServiceImpl;
import com.mycompany.myapp.service.LoginService;
import com.mycompany.myapp.service.LoginServiceImpl;
import com.mycompany.myapp.service.UpdateService;
import com.mycompany.myapp.service.UpdateServiceImpl;

@Controller

@RequestMapping("/emp")
  // 얘를 넣으면 /emp를 거쳐서 들어가게 됨
  // -> 이걸 사용함으로써 login 한 사람과 안한사람을 구분하여 보여주는 창을 달리 할 수 있음
public class EmpProcController {

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
	public void loginResult(Model model,int empNo, String eName) {
							//-> Model은 Map의 역할\
		//                        @RequestParam("empNo")
								 //-> @RequestParam은 jsp의 name과 일치시켜줘....
		/*
		 * 입력 받은 사원번호 이용해서 조회
		 * 결과를 loginResult로 보내기
		 */
		
		LoginService service = new LoginServiceImpl();
		
		model.addAttribute("empInfo", service.getEmpno(empNo, eName));
		
	}
	
	@RequestMapping("empList")
	public void empList(Model model) {
		// emp를 넘겨 줘야하니까 Emp Table과 속성이 같은 class 필요  => emp class 만들어!
		// SQL을 실행할 것이 필요  => DBConnection 호출
		// emp 목록을 jsp에 전달한다
		
		DBConnection dao;
		EmpService service = new EmpServiceImpl();
		
		model.addAttribute("emplist", service.getEmpList());
		
	}
	
	
	@RequestMapping("/empUpdate")
	public void empUpdate() {
		
	}
	
	@RequestMapping("/updateResult")
	public String updateResult(Model model,int empNo) {
		
		UpdateService service = new UpdateServiceImpl();
		Emp result = service.getEmpno(empNo);
		String location = null;
		
		if(result!=null) {
		model.addAttribute("empInfo", result);
		location = "emp/updateResult";
		}else {
		location = "emp/empUpdate";	
		}
		return location;
	}
	
	@RequestMapping("/update_old")
	public String update_old(Model model, String eName, String job, int mgr, int empNo) {
		
		UpdateService service = new UpdateServiceImpl();
		int result = service.updateEmp(empNo, eName, job, mgr);
		
		if(result ==1) {
			model.addAttribute("updatedInfo", service.getEmpno(empNo));
		}else {
			model.addAttribute("updatedInfo", null);
		}return "emp/update";
		
	}
	/*
	 * pdf 215
	 * 
	 * HTML 폼에 입력한 데이터를 자바 빈 객체로 전달받는 방법
	 * @RequestMapping 어노테이션이 적용된 메소드의 파라미터에 @param 추가해주면 됨
	 * @param model
	 * @param eName
	 * @param job
	 * @param mgr
	 * @param empNo
	 * @return
	 */
	
	
	
	@RequestMapping("/update")
	public String update(Model model, Emp emp) {
		
		UpdateService service = new UpdateServiceImpl();
		int result = service.updateEmp(emp);
		
		if(result ==1) {
			model.addAttribute("updatedInfo", service.getEmpno(emp.getEmpNo()));
		}else {
			model.addAttribute("updatedInfo", null);
		}return "emp/update";
		
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
	
	@RequestMapping("/re2")
	public String redirectTest2(Model model) {
		model.addAttribute("v", 456);
		
		return "redirect:re";
				//-> 이렇게 하면 jsp를 mapping 하는 애(@RequestMapping("/re"))를 호출!
				//   why? redirect는 jsp를 호출하지 않는다!
		
		//=> 이건 redirect라서 그 전에 실행 된 내용은 지워지고 호출됨 (안오는건 아냐!)
		//   -> 로그인을 3번이상 실수 했을때 그 전에 흔적을 지우고 다시 띄우는 용도로 쓸 수도 있음
		//        how? redirect는 request로 넘어오는 data를 다 지워버리니까
		//              (request가 갖고있는 data를 끌고가지 않으니까)
	}
}


