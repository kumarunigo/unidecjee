package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkUserPwd")
public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
			/*
			 userid: john
			password: john1!
			*/
		ArrayList<String> fruits=new ArrayList<String>();
		String uid=req.getParameter("userid");
		String pwd=req.getParameter("password");
		
		if(uid.equals("john") && pwd.equals("john1!"))
		{
			req.setAttribute("loginSuccess", true);
			req.setAttribute("name", "john doe");
			req.getRequestDispatcher("/success").forward(req, res);
		}
		else if(uid.equals("jane") && pwd.equals("jane1!"))
		{
			req.setAttribute("loginSuccess", true);
			req.setAttribute("name", "jane joe");
			req.getRequestDispatcher("/success").forward(req, res);
		}
		else
			res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-1777866834%3A1642278283091168&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
	}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		doGet(req,res) ;
	}

}
