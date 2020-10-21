package com.hefshine.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
		PrintWriter pw=response.getWriter();
		pw.print("Hello from servlet");
		
		
		String s=request.getParameter("username");
		System.out.println(s+"Home servlet");
		
		pw.print(s+"Home servlet");
		
	}

	

}
