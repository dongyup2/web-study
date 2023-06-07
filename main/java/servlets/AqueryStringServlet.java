package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AqueryStringServlet
 */
@WebServlet("/aquerystring")
public class AqueryStringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("param1"); //aaa
		String y = request.getParameter("param2"); //bbb
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("첫번째 파라미터 값: " + x);
		out.print("<br>두번째 파라미터 값: " + y);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
