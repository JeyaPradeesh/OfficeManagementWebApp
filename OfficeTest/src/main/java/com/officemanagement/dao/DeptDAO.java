package com.officemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.officemanagement.model.Dept;

public class DeptDAO {
	private String dburl = "jdbc:mysql://localhost:3306/dept";
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

	public String insert(Dept dept)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data Entered Succesfully";
		String sql = "insert into dept_tb values (?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,dept.getId());
			ps.setString(2,dept.getName());
			ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
			result = "Data not Entered";
		}
		return result;
		}
}

