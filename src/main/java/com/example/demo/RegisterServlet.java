package com.example.demo;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String uid=req.getParameter("uid");
		String pwd=req.getParameter("pwd");
		boolean result=true;
		Connection conn;
		try {
			
			conn = DatabaseConnection.getDBConnection();
			// check if userid already exists
			// if it does send customer to error page
			UsersTable.registerUser(uid, pwd, conn);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(result == true)
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
