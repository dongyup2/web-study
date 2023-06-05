package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoubleCheckServlet")
public class DoubleCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("input");

        ArrayList<String> idList = new ArrayList<>();
        idList.add("aaa");
        idList.add("bbb");
        idList.add("ccc");

        if (idList.contains(input)) {
            out.write("이미 사용 중인 아이디입니다.");
        } else {
            out.write("사용 가능한 아이디입니다.");
        }
    }

}
