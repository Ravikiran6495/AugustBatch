package com.hefshine.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hefshine.Model.Employee;

public class EmpDao {
	
	
	String url="jdbc:mysql://localhost:3306/hefshine";
	String uname="root";
	String pass="root";
	
	
	public boolean chekUsername(Employee emp)
	{
	
		
		boolean status=false;
		String sql="select username from employee where username=?";
		try
	 	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st=con.prepareStatement(sql);
		st.setString(1,emp.getUsername());
		
		ResultSet rs=st.executeQuery();
		
		
		while(rs.next())
		{
			status=true;
			//System.out.println("Exe");
		}
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return status;
		
	}


}
