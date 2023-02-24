package webProjects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDemo extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int c=a+b;
		PrintWriter p=res.getWriter();
		p.println("result is "+c);
		
	
	
	}
	
	
}
