package com.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


@WebServlet("/display")

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayServlet() {
        super();
      System.out.println("DisplayServlet constructor called");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("----DisplayServlet doGet method called-----");
			// display content on the browser
		// send response to the browser
					PrintWriter pw = response.getWriter();
					response.setContentType("text/html");
					pw.println("requeste at :" + LocalDate.now());
					pw.println("<br><h1> Welcome dynamic web page servlet programming<h1><br>");
					
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
