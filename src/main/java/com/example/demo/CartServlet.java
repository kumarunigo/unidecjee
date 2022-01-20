package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add2Cart")
public class CartServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String prodName=req.getParameter("productName");
		HttpSession sess=req.getSession();
		if(sess.getAttribute("cart") == null)
			sess.setAttribute("cart", new ArrayList<String> ());
		
		sess.setAttribute("login", true);
		sess.setAttribute("name", "john");
		sess.setAttribute("age",12);
		
		ArrayList<String> cartList=(ArrayList<String> )sess.getAttribute("cart");
		cartList.add(prodName);
		res.getWriter().write(cartList.toString());
	}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		doGet(req,res) ;
	}

}
