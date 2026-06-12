package com.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;


@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        System.out.println("----MyServlet constructor called---");
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//to send data to the client browser side
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html"); // either or text or html:
		pw.print("<h1> Welcome to MyServlet</h1>");
		pw.print("Created:" + LocalDate.now());
		
		System.out.println("----Do------get-----myServlet-----");
			// display content on the browser
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
