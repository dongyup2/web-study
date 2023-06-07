package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<String> userList = new ArrayList<String>();		
       
    public LifeCycleServlet() {
        super();
        System.out.println("create.....");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init...최초 한번만실행");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		userList.add(name);
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		for(String name1 : userList) {
			out.print("<h1>"+ name1 +"</h1>");			
		}
		
	}
	@Override
	public void destroy() {
		System.out.println("destory...");
	}
}
