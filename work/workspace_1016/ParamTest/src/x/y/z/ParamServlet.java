package x.y.z;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ParamServlet
 */
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

//    public void init() throws ServletException{
    	
//    	System.out.println(getInitParameter("benq"));
//    	System.out.println(getInitParameter("color"));
//    }
    
//    public void init(ServletConfig config) throws ServletException {

//		getServletContext().getInitParameter("color");
//		
//		System.out.println(getInitParameter("color"));
//		System.out.println(getInitParameter("benq"));
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(getServletConfig().getInitParameter("benq"));
		System.out.println(getInitParameter("color"));
		
		getServletContext().setAttribute("color", "√ ∑œ");
		System.out.println(getInitParameter("color"));
		
		
		ServletContext context = getServletContext();
		System.out.println(context.getContextPath());
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}



