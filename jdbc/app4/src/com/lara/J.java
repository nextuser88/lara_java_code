package com.lara;
import java.sql.*;
class  J
{
	public static void main(String[] args) 
	{
		String s1 = "insert into student1 values(9, 'Manoj', 24, 'mn@yahoo.com')";
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Util.getConnection();
			pstmt = con.prepareStatement(s1);// sql command should be supplied while creating a prepare stmt.
			pstmt.executeUpdate();
			pstmt.executeUpdate();
			pstmt.executeUpdate();
			pstmt.executeUpdate();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, pstmt, con);//automatically upcasted to stmt.
		}
		System.out.println("done");
	}
}
