package com.example.demo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/abcd")
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String uid=req.getParameter("uuserid");
		String pwd=req.getParameter("ppassword");
		
		if(uid.equals("john") && pwd.equals("john1!"))
			res.sendRedirect("success.html");
		else
			res.sendRedirect("failure.html");
			
	}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		doGet(req,res) ;
	}

}
