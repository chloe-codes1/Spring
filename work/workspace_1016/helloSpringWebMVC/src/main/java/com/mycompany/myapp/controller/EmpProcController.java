package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  // �긦 ������ /emp�� ���ļ� ���� ��
  // -> �̰� ��������ν� login �� ����� ���ѻ���� �����Ͽ� �����ִ� â�� �޸� �� �� ����
public class EmpProcController {

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
	public void loginResult(Model model,int empNo, String eName) {
							//-> Model�� Map�� ����\
		//                        @RequestParam("empNo")
								 //-> @RequestParam�� jsp�� name�� ��ġ������....
		/*
		 * �Է� ���� �����ȣ �̿��ؼ� ��ȸ
		 * ����� loginResult�� ������
		 */
		
		LoginService service = new LoginServiceImpl();
		
		model.addAttribute("empInfo", service.getEmpno(empNo, eName));
		
	}
	
	@RequestMapping("empList")
	public void empList(Model model) {
		// emp�� �Ѱ� ����ϴϱ� Emp Table�� �Ӽ��� ���� class �ʿ�  => emp class �����!
		// SQL�� ������ ���� �ʿ�  => DBConnection ȣ��
		// emp ����� jsp�� �����Ѵ�
		
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
	 * HTML ���� �Է��� �����͸� �ڹ� �� ��ü�� ���޹޴� ���
	 * @RequestMapping ������̼��� ����� �޼ҵ��� �Ķ���Ϳ� @param �߰����ָ� ��
	 * @param model
	 * @param eName
	 * @param job
	 * @param mgr
	 * @param empNo
	 * @return
	 */
	
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
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
		//-> return type �� String�̶� emp/ ���� ���� views/re�� ã�� => emp/ �ٿ������!
		//    but, void type�̸� ��� ����!
		
		// => �̰� forward�� ����� jsp�� ���´ٰ� �ϴ��� url�� ȣ���� �ַ� ����
		//    -> data�� �̾ ������ forward�� �ؾ���!!!
	}
	
	@RequestMapping("/re2")
	public String redirectTest2(Model model) {
		model.addAttribute("v", 456);
		
		return "redirect:re";
				//-> �̷��� �ϸ� jsp�� mapping �ϴ� ��(@RequestMapping("/re"))�� ȣ��!
				//   why? redirect�� jsp�� ȣ������ �ʴ´�!
		
		//=> �̰� redirect�� �� ���� ���� �� ������ �������� ȣ��� (�ȿ��°� �Ƴ�!)
		//   -> �α����� 3���̻� �Ǽ� ������ �� ���� ������ ����� �ٽ� ���� �뵵�� �� ���� ����
		//        how? redirect�� request�� �Ѿ���� data�� �� ���������ϱ�
		//              (request�� �����ִ� data�� ������ �����ϱ�)
	}
}


