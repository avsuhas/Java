package com.samsonsoft;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstName");
		out.println("Hello from the get method"+ firstName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		out.println("Hello from Post Method  "+ first_name +" "+last_name+"\n");

		String Sex = request.getParameter("Sex");
		out.println("you are a "+Sex);
		
		String Address = request.getParameter("Address");
		out.println("Home Address is:  "+Address);
		out.println();
		
		String City = request.getParameter("City");
		out.println(City);
		out.println();
		
		String Country = request.getParameter("Country");
		out.println(Country);
		out.println();
		
		String[] Hobbies = request.getParameterValues("Hobbies");
		out.println("Your Hobbies are "+ Hobbies.length );
		for(int i=0; i<Hobbies.length; i++){
			out.println(Hobbies[i]);
			
		
		}
		
	
	}
	
}
