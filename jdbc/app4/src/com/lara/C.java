package com.lara;
import java.sql.*;
class  C
{
	public static void main(String[] args) 
	{
		String s1 = "insert into employee values(";
		String s2 = s1 + "1, 'abc', 'a@a.com', 22)";
		String s3 = s1 + "2, 'test', 'a@t.com', 24)";
		String s4 = s1 + "3, 'xyz', 'x@t.com', 25)";
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(s2);
			System.out.println("s2 done");
			stmt.executeUpdate(s3);
			System.out.println("s3 done");
			stmt.executeUpdate(s4);
			System.out.println("s4 done");
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
