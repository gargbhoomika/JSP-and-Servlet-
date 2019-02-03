package co.calculator;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("Num1"));
		int j = Integer.parseInt(request.getParameter("Num2"));
		
		int k = i+j;
		PrintWriter out = response.getWriter();
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k);
		
//		Cookie cookie = new Cookie("k",k+"");
//		res.addCookie(cookie);
//		
//		out.println("Sum is: "+k);
		
//		res.sendRedirect("sq");
		
		
		List<Student> studs = Arrays.asList(new Student(1,"Bhoomika"),new Student(2,"Bhavy"));
		
		Student s = new Student(1,"Bhoomika");
		
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
		rd.forward(request, response);

	}

}

