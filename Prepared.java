package com.pre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
			pstmt = con.prepareStatement("select * from students");
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.print(rs.getInt("sno") + "\t");
				System.out.print(rs.getString("sname") + "\t");
				System.out.print(rs.getString("gender") + "\t");
				System.out.println(rs.getDouble("fee"));
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e) { }
		}
	}
}