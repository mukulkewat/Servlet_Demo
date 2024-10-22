package com.task1.nit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/user")
public class UserInfo extends GenericServlet{

	@Override
	public void service(ServletRequest res, ServletResponse req) throws ServletException, IOException {
		int uid = Integer.parseInt(res.getParameter("uid"));
		String fName = res.getParameter("fName");
		String lName = res.getParameter("lName");
		String mid = res.getParameter("mid");
		long phno = Long.parseLong(res.getParameter("phno"));
		
		req.setContentType("text/html");
		PrintWriter print = req.getWriter();
		print.println("Id: "+uid+"<br>");
		print.println("First Name: "+fName+"<br>");
		print.println("Last Name: "+lName+"<br>");
		print.println("Mail Id: "+mid+"<br>");
		print.println("Phone No: "+phno+"<br>");
	}

}
