package com;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callable1 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
			cstmt = con.prepareCall("{call ps}");
			cstmt.execute();
			System.out.println("success...");
		}
		catch( ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(cstmt != null) {
					cstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e) { }
		}
	}
}
