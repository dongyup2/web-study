package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/checkbox")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf8");
		
		String[] hobbies = null;
		if(hobbies == null) {
			out.print("취미가 없군요!");
			return;
		}else {
			for(int i = 0; i < hobbies.length; i++) {
				out.print(hobbies[i] + "<br>");
			}
		}
	}

}
