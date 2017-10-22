package com.lara;
import java.sql.*;

class M  
{
	public static void main(String[] args) 
	{
		String s1 = "update student1 set name = ? where id = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Util.getConnection();
			pstmt = con.prepareStatement(s1);
			pstmt.setString(1, "changed");
			pstmt.setInt(2, 4);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "new name");
			pstmt.setInt(2, 7);
			pstmt.executeUpdate();

			pstmt.setString(1, "babu");
			pstmt.setInt(2, 11);
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
