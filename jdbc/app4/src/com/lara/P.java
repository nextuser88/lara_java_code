package com.lara;
import java.sql.*;
class  P
{
	public static void main(String[] args) 
	{
		Connection con = null;
		//CallableStatement is used to give a call to stored Procedure.
		CallableStatement cstmt  = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call pr1}");
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
