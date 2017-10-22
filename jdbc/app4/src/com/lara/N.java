package com.lara;
import java.sql.*;
class N 
{
	public static void main(String[] args) 
	{
		String s1 = "insert into student1 values(13, ?, 40, ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Util.getConnection();
			pstmt = con.prepareStatement(s1);
			pstmt.setString(1,"abc");
			//pstmt.setString(2,"a@bc.com");
			pstmt.executeUpdate();

			pstmt.setString(1,"xyz");
			pstmt.setString(2,"x@yz.com");
			pstmt.executeUpdate();

		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, pstmt, con);
		}
		System.out.println("done");
	}
}
