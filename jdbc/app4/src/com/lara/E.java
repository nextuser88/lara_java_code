package com.lara;
import java.sql.*;
class E 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		try
		{
			con = Util.getConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			String s1 = dbmd.getDriverName();
			String s2 = dbmd.getDatabaseProductName();
			System.out.println(s1);
			System.out.println(s2);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, null, con);
		}
		System.out.println("done");
	}
}
