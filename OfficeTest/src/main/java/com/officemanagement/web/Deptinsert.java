package com.officemanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.officemanagement.model.Dept;
import com.officemanagement.dao.DeptDAO;


@WebServlet("/DeptInsert")
public class Deptinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Deptinsert() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		Dept dept=new Dept(id,name);
		DeptDAO dDAO=new DeptDAO();
		String result=dDAO.insert(dept);
		response.sendRedirect("Department.jsp");
	}

}
