package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// annotation = configuration
// configuration = settings = HTTP url is being pointed to java program
@WebServlet("/IsUserAvailable")
// above http URL is alias mapped to below java program
// john = 1231231231
public class CheckUser extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		checkUserAvailability(req, res);	
	}	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		checkUserAvailability(req, res);	
	}

	private void checkUserAvailability(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ArrayList<String> registeredUsers=new ArrayList<String>();
		registeredUsers.add("john");
		registeredUsers.add("jane");
		registeredUsers.add("mike");
		String chosenUserid=req.getParameter("uid");
		if(registeredUsers.contains(chosenUserid))
			res.getWriter().write("unavailable"); // text response from server program
		else {
			String response="available";
			byte[] binaryResponse=response.getBytes(); // 10101010101010
			res.getOutputStream().write(binaryResponse); // binary response from server program
		}
	}
/*
 	Java file
 	Character stream = Text content
 		Reader and Writer
 	Binary stream = Binary/byte content
 		InputStream and Output Stream
 */
}
