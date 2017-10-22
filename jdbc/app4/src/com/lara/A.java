package com.lara;
import java.sql.*;

class A 
{
	public static void main(String[] args) 
	{
		String sql = "create table tab301(id int)";
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.execute(sql);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, stmt, con);
		}
		System.out.println("done");
	}
}
