package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.UserVo;

/**
 * Servlet implementation class PageMoveServlet
 */
@WebServlet("/pagemove")
public class PageMoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	ArrayList<UserVo> list = new ArrayList<UserVo>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginPageServlet loginPageServlet = new LoginPageServlet();
		
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		boolean success = false;
		for (UserVo userVo : loginPageServlet.loginlist) {
			if (userVo.getId().equals(id) && userVo.getPassword().equals(password)) {
				success = true;
				break;
			}
		}

		if (success) {
			response.sendRedirect("succes.jsp");
		} else {
			response.sendRedirect("fail.jsp");
		}
	}


}
