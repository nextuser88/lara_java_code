package com.lara;
import java.sql.*;
class F 
{
	public static void main(String[] args) 
	{
		String sql = "create table student3 ";
		sql += "(id int, name varchar(90), age int)";
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
			Util.closeAll(null, stmt, con);
		}
		System.out.println("done");
	}
}
