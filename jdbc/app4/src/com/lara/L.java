package com.lara;
import java.sql.*;
class L 
{
	public static void main(String[] args) 
	{
		String s1 = "insert into student1 values(?, ?, ?, ?)";//(?)parameter Index or placeHolder.
		Connection con = null;
		PreparedStatement pstmt = null;
		try
		{
			con = Util.getConnection();
			pstmt = con.prepareStatement(s1);
			
			pstmt.setInt(1,10);
			pstmt.setString(2,"murali");
			pstmt.setInt(3,30);
			pstmt.setString(4,"m@yahoo.com");
			pstmt.executeUpdate();
			pstmt.setInt(1,11);
			pstmt.setString(2,"mohan");
			pstmt.setInt(3,28);
			pstmt.setString(4,"mo@yahoo.com");
			pstmt.executeUpdate();
			pstmt.setInt(1,12);
			pstmt.setString(2,"raghu");
			pstmt.setInt(3,44);
			pstmt.setString(4,"rg@yahoo.com");
			//before calling executeUpdate set the data.
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
