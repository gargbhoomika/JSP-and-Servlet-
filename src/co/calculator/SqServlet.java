package co.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException
	{
		int k =0;
		PrintWriter out = res.getWriter();
		
//		HttpSession session = req.getSession();
//		
//		int k = (int)(session.getAttribute("k"));
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		
		k = k*k;
		
		out.println("Square is: "+k);		
	}
}
