package com.lara;
import java.sql.*;
class  K
{
	public static void main(String[] args) 
	{
		String s1 = "select * from student1"; 
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			con = Util.getConnection();
			pstmt = con.prepareStatement(s1);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(rs, pstmt, con);
		}
		System.out.println("done");
	}
}
