package com.officemanagement.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updated
 */
@WebServlet("/update")
public class StaffUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StaffUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }	   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
		String contact=request.getParameter("contact");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/officem","root","admin");
	    PreparedStatement ps=con.prepareStatement("update emp set name=?,email=?,department=?,contact=? where id=?");
	    ps.setString(1, name);
	    ps.setString(2, email);
	    ps.setString(3, department);
	    ps.setString(4, contact);
	    ps.setString(5, id);
	    int r=ps.executeUpdate();
	    PrintWriter out=response.getWriter();
	    if(r>0)
	    {
	       response.sendRedirect("Staff.jsp");
	    }
	    else {
	    	out.print("Update Failed");
	    }
	    con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	//	response.sendRedirect("Staff.jsp");
		
	}
}