package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/radio")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int mancnt = 0;
	int womancnt = 0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();					
		//gender = woman : 여성전용 페이지 이동.
		if(gender.equals("woman")) {
			womancnt++;
			out.print(womancnt + "번째 여성입니다.");
			response.sendRedirect("womanpage.jsp");
		}else {
			//gender = man : 남성전용 페이지이동.
			mancnt++;
			out.print(mancnt + "번째 남성입니다.");
			response.sendRedirect("manpage.jsp");
		}
		
	}

}
