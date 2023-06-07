package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
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
		ServletContext context = getServletContext();
		ArrayList<UserVo> loginlist = (ArrayList<UserVo>) context.getAttribute("loginlist");
		if (loginlist == null) { // 리스트가 없으면 로그인 실패 처리
            response.sendRedirect("fail.jsp");
            return;
        }
		
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
