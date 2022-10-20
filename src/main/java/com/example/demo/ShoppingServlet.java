package com.example.demo;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/shop")
public class ShoppingServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
			String product=req.getParameter("product");
			HttpSession sess=req.getSession();
			
			if(sess.getAttribute("cart") == null) {
				ArrayList<String> newCart= new ArrayList<String> ();
				sess.setAttribute("cart", newCart);
			}
			ArrayList<String> existingcart= (ArrayList<String>)sess.getAttribute("cart");
			existingcart.add(product);
			res.getWriter().write(existingcart.toString());
		}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		doGet(req,res) ;
	}

}
