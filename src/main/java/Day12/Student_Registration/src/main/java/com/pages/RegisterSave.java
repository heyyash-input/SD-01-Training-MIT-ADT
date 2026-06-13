package com.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/save")
public class RegisterSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterSave() {
        super();
        System.out.println("----Register Servlet constructor called-----");
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<h1>Welcome to Register Servlet</h1>");
		pw.print("Created: " + LocalDateTime.now());
		
		String str1 = request.getParameter("txtname");
		String str2 = request.getParameter("txtemail");
		String str3 = request.getParameter("txtcontact");
		String str4 = request.getParameter("txtcity");
		
		pw.print("Welcome you are successfully registered: " + str1); 

		System.out.println("----Register Servlet doGet method called-----");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
