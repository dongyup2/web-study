package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Like2Servlet
 */
@WebServlet("/life2")
public class Like2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int n = 10;
	public Like2Servlet() {
		System.out.println("1.객체생성");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("2.최초 1회만 호출 Life2Servlet 초기화");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3.Life2Servlet 요청 응대.." + n++);
	}
	
	public void destroy() {
		System.out.println("q.객체 소멸됨");
	}

}
