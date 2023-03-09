package webProjects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDemo extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int number1=Integer.parseInt(req.getParameter("num1"));
		int number2=Integer.parseInt(req.getParameter("num2"));
		int add=number1+number2;
		PrintWriter printwriter=res.getWriter();
		printwriter.println("result is "+add);
		
	
	
	}
	
	
}
