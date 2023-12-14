package com.officemanagement.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeptUpdate")
public class DeptUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DeptUpdate() {
        super();      
    }	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dept","root","admin");
		    PreparedStatement ps=con.prepareStatement("update dept_tb set Department_name=? where id=?");
		    ps.setString(1, name);
		    ps.setString(2, id);
		    int r=ps.executeUpdate();
		    PrintWriter out=response.getWriter();
		    out.print("<html><body>");
		    if(r>0)
		    {
		    	response.sendRedirect("Department.jsp");
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