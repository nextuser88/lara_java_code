package com.lara;
import java.sql.*;
class  R
{
	public static void main(String[] args) 
	{
		Connection con  = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p2}");
			cstmt.execute();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, cstmt, con);
		}
		System.out.println("done");
	}
}
