package com.lara;
import java.sql.*;
class  U
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			ctmt = con.prepareCall("{call p3(?, ?, ?, ?)}");
			ctmt.setInt(1, 50);
			ctmt.setString(2, "abc");
			ctmt.setInt(3, 25);
			ctmt.setString(4, "a@a.com");
			ctmt.execute();
			ctmt.setInt(1, 51);
			ctmt.setString(2, "xyz");
			ctmt.setInt(3, 27);
			ctmt.setString(4, "a@c.com");
			ctmt.execute();
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, ctmt, con);
		}
		System.out.println("done");
	}
}
