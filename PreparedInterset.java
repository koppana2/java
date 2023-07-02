package com.pre;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	public class PreparedInterset {
		public static void main(String[] args) 
		{
			Connection con = null;
			PreparedStatement pstmt = null;
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasad", "prasad");
				pstmt = con.prepareStatement("update students set fee = ? where sno = ?");
				
				pstmt.setDouble(1, 15000);
				pstmt.setInt(2, 1);
				
				
				int n = pstmt.executeUpdate();
				
				if(n>0) {
					System.out.println("record is updated..");
				}else {
					System.out.println("record is not updated..");
				}
			}
			catch(SQLException | ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
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
	
