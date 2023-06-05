package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamServlet
 */
@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청을 처리하기 위해 필요한 준비사항
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//요청처리 -> 클라이언트가 서버로 보낸 데이터를 받는 것.
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
	
		//응답
		int newnum1 = Integer.parseInt(num1);
		int newnum2 = Integer.parseInt(num2);
		
		int sum = newnum1 + newnum2;
		out.print("<h1>첫번째 숫자와 "+ newnum1 + "두번째 숫자 " + newnum2 + "의 합은: " + sum +"<h1/>");
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		
		out.print("파라메터: " + username);
		
	}
}
