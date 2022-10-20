package com.example.demo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		if(req.getRemoteAddr().equals("1.2.3.4"))
			res.sendRedirect("blocked.html");
		
		
		String uid=req.getParameter("uuserid");
		String pwd=req.getParameter("ppassword");
		
		if(uid.equals("john") && pwd.equals("john1!"))
			req.getRequestDispatcher("success.jsp").forward(req, res);
		else if(uid.equals("jane") && pwd.equals("jane1!"))
			res.getWriter().write("welcome jane");
		else if(uid.equals("mike") && pwd.equals("mike1!"))
		{
			String ab="welcome mike";
			byte[] binaryData=ab.getBytes();
			res.getOutputStream().write(binaryData);
		}
		else
			res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
			
	}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		doGet(req,res) ;
	}

}
