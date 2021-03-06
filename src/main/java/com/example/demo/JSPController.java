package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPController {
	// http://ipaddress:port/success
	@RequestMapping("/success")
	public String welcome() {
		return "welcome";
		// http://localhost<PREFIX><return result><SUFFIX>
		// http://localhost/jsp/welcome.jsp
	}
	// http://localhost/abcd
	// http://localhost<PREFIX><return result><SUFFIX>
	// http://localhost/jsp/testing.jsp
	@RequestMapping("/abcd")
	public String test() {
		return "testing";
	}
	
	@RequestMapping("/add2Cart")
	public String addCart() {
		return "AddingInCart";
	}
	
//customer types : http://ip:port/add2Cart
//send customer : http://ip:port/jsp/AddingInCart.jsp

// Prefix + return result + suffix
// /jsp/welcome.jsp
}
