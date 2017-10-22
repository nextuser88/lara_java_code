package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Manager11
{
		
	public static void main(String[] args) 
	{

	Connection con = null;
	PreparedStatement pstmt = null;
		
		try
		{
			con = Manager3.getConnection();
			pstmt = con.prepareStatement("insert into tab3 values(?,?)");			
			pstmt.setInt(1,701);
			pstmt.setString(2,"Hello");			
			pstmt.executeUpdate();

			System.out.println("one query done");

			pstmt.setInt(1,702);
			pstmt.setString(2,"vijay");			
			pstmt.executeUpdate();

			System.out.println("Two query done");			
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		
		}
		finally
		{
		Manager3.closeAll(null, pstmt, con);
		}
	}
}
