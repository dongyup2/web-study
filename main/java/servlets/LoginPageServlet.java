package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.UserVo;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<UserVo> loginlist = new ArrayList<UserVo>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		UserVo userVo = UserVo.builder()
				.name(name)
				.email(email)
				.id(id)
				.password(password)
				.build();

		loginlist.add(userVo);

		response.sendRedirect("loginpage.jsp"); // Redirect to the login page.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

