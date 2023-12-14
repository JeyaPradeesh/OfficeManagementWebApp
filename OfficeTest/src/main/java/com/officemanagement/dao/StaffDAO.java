package com.officemanagement.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.officemanagement.model.Staff;

public class StaffDAO {
	private String dburl = "jdbc:mysql://localhost:3306/officem";
	private String dbuname = "root";
	private String dbpassword = "admin";
	private String dbdriver = "com.mysql.jdbc.Driver";
	                             
	public void loadDriver(String dbdriver) {
	}
	 
	{
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Staff staff)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data Entered Succesfully";
		String sql = "insert into officem.emp values(?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, staff.getId());
			ps.setString(2, staff.getName());
			ps.setString(3, staff.getEmail());
			ps.setString(4, staff.getDepartment());
			ps.setString(5, staff.getContact());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
			result = "Data not Entered";
		}
		return result;
		}
}
/*public String update(Staff staff)throws SQLException
	{
	try {
		loadDriver(dbdriver);
		Connection con=getConnection();
		String usql="update staffdb.emp set id=?, name=?, email=?, country=?, contact=? where id=?";
		BufferedReader	br=new BufferedReader(new InputStreamReader(System.in));
		PreparedStatement ps=con.prepareStatement(usql);
			ps.setString(1,staff.getId());
			ps.setString(2, staff.getName());
			ps.setString(3, staff.getEmail());
			ps.setString(4, staff.getCountry());
			ps.setString(5, staff.getContact());
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			result="Data update failed";
		}
		return result;
		}			
	/*public Staff selectStaff(int id)
	  {
		loadDriver(dbdriver);
		Connection con=getConnection();
		  String result="Select Success";
		  try {
			  
		  }
					PreparedStatement ps=con.prepareStatement(SELECT_EMP_BY_ID);)
				  {
					  ps.setInt(1, id);
					  System.out.print(ps);
					  ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString("name");
			String email=rs.getString("email");
			String county=rs.getString("country");
			int contact=rs.getInt("contact");
			staff=new Staff(name,email,country,contact);
		}
	 }catch(SQLException e) {
			e.printStackTrace();
		}
			return staff;		  	  
	   }	




}
*/

	
	
	
	
	
	
	
	

