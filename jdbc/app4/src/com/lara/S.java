package com.lara;
import java.sql.*;
class S 
{
	public static void main(String[] args) 
	{
		String s1 = "create or replace procedure p3 " +
					"(arg1 int, arg2 varchar, arg3 int, arg4 varchar); "+
					"as begin " +
					"insert into student1 values(arg1, arg2, arg3, arg4); " +
					"insert into student2 values(arg1, arg2, arg3, arg4); " +
					"end;";
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.execute(s1);
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
