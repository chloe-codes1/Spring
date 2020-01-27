package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SavingDAO;
import service.SavingService;
import service.SavingServiceImpl;
import vo.SavingVO;

@WebServlet("/list_saving.do")
public class SavingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String accountNumber = request.getParameter("accountNumber");
		String username = request.getParameter("username");
		
		System.out.println(accountNumber);
		System.out.println(username);
		
		System.out.println("/list_saving.do 요청 처리");
		
		SavingDAO dao = new SavingDAO();
		SavingService service = new SavingServiceImpl(dao);
		
		List<SavingVO> list = new ArrayList<SavingVO>();
		
			list.addAll(service.savingsearch(accountNumber, username));
		
		System.out.println(list);
		
		request.setAttribute("saving_list", list);
		request.setAttribute("username", username + " 's Savings Account Info.");
		
		String view = "/Saving_list_result.jsp";
		
		getServletContext().getRequestDispatcher(view).forward(request, response);
	}
	
	

}
