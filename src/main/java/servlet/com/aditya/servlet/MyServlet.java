package com.aditya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aditya.dao.LoginDao;
import com.aditya.dao.UserDao;
import com.aditya.pojo.User;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * User u = new User(); UserDao ud = new UserDao();
	 */

	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		if (uname.equals("Sujal") && pass.equals("2003")) {
			response.sendRedirect("HomePage.jsp");
		} else {
			response.sendRedirect("Login.jsp");
		}
	}
}
		/*
		 * String action=request.getParameter("action"); PrintWriter
		 * out=response.getWriter(); String Name=request.getParameter("Name"); String
		 * Number=request.getParameter("Number"); String
		 * Email=request.getParameter("Email"); String
		 * Password=request.getParameter("Password"); System.out.println("Success");
		 * System.out.println("Name: " +Name);
		 * 
		 * System.out.println(action); u.setName(Name); u.setNumber(Number);
		 * u.setEmail(Email); u.setPassword(Password);
		 * 
		 * boolean b=ud.addUser(u);
		 * 
		 * if (b) {
		 * 
		 * response.sendRedirect("HomePage.jsp"); } else {
		 * 
		 * response.sendRedirect("Error.jsp"); }
		 * 
		 * 
		 * String uname=request.getParameter("uname"); String
		 * pass=request.getParameter("pass");
		 * 
		 * LoginDao dao=new LoginDao();
		 * 
		 * if (dao.check(uname, pass)) if (uname.equals("adi") && pass.equals("123")) {
		 * HttpSession session=request.getSession(); session.setAttribute("Username",
		 * uname); response.sendRedirect("HomePage.jsp");
		 * 
		 * response.sendRedirect("HomePage.jsp"); } else {
		 * response.sendRedirect("Login.jsp"); }
		 * 
		 * 
		 * }
		 */


