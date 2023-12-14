package com.officemanagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalarySlip")
public class SalarySlip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalarySlip() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
			   
			    String ename=request.getParameter("ename");
			    String dept=request.getParameter("dept");
			    String des=request.getParameter("des");
			    double bsal=Double.valueOf(request.getParameter("bsal"));
			    double ta=Double.valueOf(request.getParameter("ta"));
			    double ta2=bsal*ta/100;
			    double da=Double.valueOf(request.getParameter("da"));
			    double da2=bsal*da/100;
			    double hra=Double.valueOf(request.getParameter("hra"));
			    double hra2=bsal*hra/100;
			    double pf=Double.valueOf(request.getParameter("pf"));
			    double pf2=bsal*pf/100;
			    double lic=Double.valueOf(request.getParameter("lic"));
			    double lic2=bsal*lic/100;
			    double allowance;
			    double deduction;
			    double gsal;
			    double netsal;

			    allowance = (bsal*ta)/100 + (bsal*da)/100 + (bsal*hra)/100;
			    deduction = (bsal*pf)/100 + (bsal*lic)/100;
			    gsal = bsal + allowance;
			    netsal = gsal - deduction;
			   


			%>
			    <CENTER>
			    <table border=5 bgcolor="biege" height=600 width=400 >
			    <caption><h2><font color="blue" >XYZ Company Ltd.,<br>SALARY STATEMENT</font></h2></caption>
			    <tr><td>Employee Name</td><td colspan=2><%=ename%></td></tr>
			    <tr><td>Department</td><td colspan=2><%=dept%></td></tr>
			    <tr><td>Designation</td><td colspan=2><%=des%></td></tr>
			    <tr><td>Basic Salary</td><td colspan=2><%=bsal%></td></tr>
			    <tr><th>Allowances</th><th>Percentage</th><th>Amount</th></tr>
			    <tr align=center><td>TA</td><td><%=ta%></td><td><%=ta2%></td></tr>
			    <tr align=center><td>DA</td><td><%=da%></td><td><%=da2%></td></tr>
			    <tr align=center><td>HRA</td><td><%=hra%></td><td><%=hra2%></td></tr>
			    <tr><th>Total Allowance:</th><td colspan=2><%=allowance%></td><tr>
			    <tr><th>Deductions</th><th>Percentage</th><th>Amount</th></tr>
			    <tr align=center><td>PF</td><td><%=pf%></td><td><%=pf2%></td></tr>

			    <tr align=center><td>LIC</td><td><%=lic%></td><td><%=lic2%></td></tr>
			    <tr><th>Total Deduction:</th><td colspan=2><%=deduction%></td><tr>
			    <tr><td>Gross Salary</td><td colspan=2><%=gsal%></td></tr>
			   
			    <tr><td>Net Salary</td><td colspan=2><%=netsal%></td></tr>
			    </table>
			    </CENTER>

	%>
	
	
	
	
	}

}
