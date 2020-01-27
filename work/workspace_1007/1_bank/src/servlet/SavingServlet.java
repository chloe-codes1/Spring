package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SavingDAO;
import service.SavingService;
import service.SavingServiceImpl;
import vo.SavingVO;

@WebServlet("/saving.do")
public class SavingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();

		System.out.println("/saving.do 요청 처리");

		SavingDAO dao = new SavingDAO();
		SavingService service = new SavingServiceImpl(dao);

		SavingVO vo = new SavingVO();

		String username = request.getParameter("username");
		String period = request.getParameter("period");
		String amount = request.getParameter("amount");

		vo.setUsername(username);
		vo.setAccountPeriod(Integer.parseInt(period));
		vo.setMonthlyDeposit(Integer.parseInt(amount));

		System.out.println(username);
		System.out.println(period);
		System.out.println(amount);

		try {
			
			String accountNumber= service.openAccount(vo);
			
			request.setAttribute("accountNumber", accountNumber);
		
			request.setAttribute("username", username);
			
			String view = "/Saving_list.jsp";
			getServletContext().getRequestDispatcher(view).forward(request, response);
			
		} catch (Exception e) {
			out.print("<script>alert('적금 계좌 개설 실패'); location.href='Saving.jsp';</script>");
			out.flush();
		}
	}

}
