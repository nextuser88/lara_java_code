package com.lara;
import java.sql.*;
class  T
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p3(40, 'ramana', 25, 'r@r.com')}");
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
