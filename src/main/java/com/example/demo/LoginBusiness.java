package com.example.demo;

import java.sql.Connection;

public class LoginBusiness {
	public static boolean checkUser(String uid,String pwd) {
		boolean result=false;
		Connection conn;
		try {
			conn = DatabaseConnection.getDBConnection();
			result=UsersTable.validateLogin(uid, pwd, conn);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
