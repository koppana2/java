package com.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Ret {
	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		Statement stmt = null;
		
		
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
		
			stmt = con.createStatement();
			
			int n = stmt.executeUpdate("delete from employee where eno = 5");
			
			if(n > 0) {
				System.out.println("record is deleted...");
			} else {
				System.out.println("record is not deleted...");
			}
		stmt.close();	
			con.close();
		}
}
