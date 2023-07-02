package com.test;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retive5
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
		
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select ename from employee where eno = 2");
			
			if(rs.next()) {
				System.out.println(rs.getString("ename"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs != null) {
					rs.close();
				}
				
				if(stmt != null) {
					stmt.close();
				}
			
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e) { }
		}
	}
}