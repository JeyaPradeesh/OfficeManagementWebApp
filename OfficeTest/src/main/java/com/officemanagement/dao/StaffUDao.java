package com.officemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.officemanagement.model.Staff;

public class StaffUDao {

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
	public String update(Staff staff) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result = "Data updated Succesfully!!!";
		String sql = "update emp set id=?, name=?, email=?,department=?,contact=? where id=?";
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
			result = "Data not Updated!";
		}
		return result;

	}

}
