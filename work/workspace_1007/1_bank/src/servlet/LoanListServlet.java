package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoanDAO;
import service.LoanService;
import service.LoanServiceImpl;
import vo.LoanVO;

@WebServlet("/list_loan.do")
public class LoanListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String accountNumber = request.getParameter("accountNumber");
		String username = request.getParameter("username");
		
		System.out.println(accountNumber);
		System.out.println(username);
		
		System.out.println("/list_loan.do 요청 처리");
		
		LoanDAO dao = new LoanDAO();
		LoanService service = new LoanServiceImpl(dao);
		
		List<LoanVO> list = new ArrayList<LoanVO>();
		
			list.addAll(service.loansearch(accountNumber, username));
		
		System.out.println(list);
		
		request.setAttribute("loan_list", list);
		request.setAttribute("username", username + " 's Loan Account Info.");
		
		String view = "/Loan_list_result.jsp";
		
		getServletContext().getRequestDispatcher(view).forward(request, response);
	}
}
