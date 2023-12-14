package com.officemanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.officemanagement.model.Staff;
import com.officemanagement.dao.StaffDAO;

@WebServlet("/StaffInsert")
public class StaffInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StaffInsert() {
    	super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String department=request.getParameter("department");
	    String contact=request.getParameter("contact");
		Staff staff=new Staff(id,name,email,department,contact);
		StaffDAO sDAO=new StaffDAO();
		String result=sDAO.insert(staff);
		response.sendRedirect("Staff.jsp");
		//response.getWriter().print(result);
	}
}
