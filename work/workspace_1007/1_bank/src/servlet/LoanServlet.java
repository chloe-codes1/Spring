package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoanDAO;
import service.LoanService;
import service.LoanServiceImpl;
import vo.LoanVO;

@WebServlet("/loan.do")
public class LoanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		System.out.println("/loan.do 요청 처리");
		
		LoanDAO dao = new LoanDAO();
		LoanService service = new LoanServiceImpl(dao);
		
		LoanVO vo = new LoanVO();
	
		String username = request.getParameter("username");
		String period = request.getParameter("period");
		String amount = request.getParameter("amount");
		
		
		vo.setUsername(username);
		vo.setAccountPeriod(Integer.parseInt(period));
		vo.setLoan(Integer.parseInt(amount));
		
		
		System.out.println(username);
		System.out.println(period);
		System.out.println(amount);
		
		try {
		service.openAccount(vo);
		request.setAttribute("username", username);
		
		String view = "/Loan_list.jsp";
		getServletContext().getRequestDispatcher(view).forward(request, response);
		
		} catch (Exception e) {
			out.print("<script>alert('대출 계좌 개설 실패'); location.href='Loan.jsp';</script>");
			out.flush();
		}
		}

	}

