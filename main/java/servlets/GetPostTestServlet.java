package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetPostTestServlet
 */
@WebServlet("/getpost")
public class GetPostTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int newnum1 = Integer.parseInt(num1);
		int newnum2 = Integer.parseInt(num2);
		
		int sum = newnum1 + newnum2;
		
		out.print("<h2>합은: "+sum+"</h2>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.print("<h2> 아이디: " + id + "</h2>");
		out.print("<h2> 비밀번호: " + password + "</h2>");
	}

}
