package com.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public WelcomeServlet() {
        super();
    System.out.println("WelcomeServlet constructor called");
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("----WelcomeServlet doGet method called-----");
				// display content on the browser
			// send response to the browser
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			pw.println("requeste at :" + LocalDate.now());
			pw.println("Welcome dynamic web page servlet programming");
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
