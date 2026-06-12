package com.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegistrationStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegistrationStudent() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----RegistrationStudent doGet method called-----");
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		//get student name and email from the request object
		String str1 = request.getParameter("txtname");
		String str2 = request.getParameter("txtcity");
		String str3 = request.getParameter("txtemail");
		String str4 = request.getParameter("txtcontact");
		
		pw.print("<h1>Welcome to MIT Registration </h1>");
		pw.print("<h3>Student Details</h3>");
		pw.print("Name: " + str1 + "<br>");
		pw.print("City: " + str2 + "<br>");
		pw.print("Email: " + str3 + "<br>");
		pw.print("Contact: " + str4 + "<br>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
