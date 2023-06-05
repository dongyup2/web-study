package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.MemberVo;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/memberlist")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    ArrayList<MemberVo> memberList = new ArrayList<>();
	   
	    MemberVo membervo = new MemberVo();
	    membervo.setMno(1);
	    membervo.setName("홍길동");
	    membervo.setPhone("010-1111-1111");
	    memberList.add(membervo);
	    
	    MemberVo membervo2 = new MemberVo();
	    membervo2.setMno(2);
	    membervo2.setName("임꺽정");
	    membervo2.setPhone("010-2222-2222");
	    memberList.add(membervo2);

	    response.setContentType("text/html;charset=utf8");
	    PrintWriter out = response.getWriter();
	    out.print("<h1>MemberList</h1>");
	    out.print("<hr>");
	    out.print("<table border =1px>"
	            + "<tr>"
	            + " <th>번호</th><th>이름</th><th>연락처</th>\r\n"
	            + "</tr>");
	    for (MemberVo member : memberList) {
	        out.print("<tr>"
	                + "<th>" + member.getMno() + "</th><th>" + member.getName() + "</th><th>" + member.getPhone() + "</th>"
	                + "</tr>");
	    }	    
	    out.print("</table>");
	}

}

