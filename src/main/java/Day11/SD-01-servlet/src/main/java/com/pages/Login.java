package com.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;


@WebServlet("/chklogin")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login() {
        super();
     System.out.println("----Login constructor called---");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.print("<h1>Welcome to Login Servlet</h1>");
		pw.print("Created: " + LocalDateTime.now());
		
		String str1 = request.getParameter("txtuser");
		String str2 = request.getParameter("txtpwd");
		
		pw.print("Welcome: " + str1); 
		System.out.println("----Login Servlet doGet method called-----");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
