package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HangulServlet
 */
@WebServlet("/hangul")
public class HangulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param1 = request.getParameter("xxx"); // aaa
		String param2 = request.getParameter("yyy"); //bbb
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("param1 : " + param1);
		out.println("param2 : " + param2);
//		System.out.println("param1 : " + param1);
//		System.out.println("param2 : " + param2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String param1 = request.getParameter("xxx"); // aaa
		String param2 = request.getParameter("yyy"); //bbb
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("param1 : " + param1);
		out.println("param2 : " + param2);
	}

}
