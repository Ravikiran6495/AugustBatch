package com.hefshine.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hefshine.Dao.EmpDao;
import com.hefshine.Model.Employee;

public class DemoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");

		PrintWriter out = response.getWriter();

		Employee emp = new Employee(uname, pass);

		EmpDao dao = new EmpDao();
		System.out.println("called");

		if (dao.chekUsername(emp)) {
		
			RequestDispatcher rd=request.getRequestDispatcher("/HomeServlet");
			rd.forward(request, response);
		} else {
			out.print("sorry your username is not found");
			RequestDispatcher rd=request.getRequestDispatcher("/HomeServlet");
			rd.include(request, response);
			
		}

	}

}
