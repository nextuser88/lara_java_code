package com.lara;
import java.sql.*;
class  B
{
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("create table employee ");
		sql.append("(sno int, ");
		sql.append("name varchar(90), ");
		sql.append("email varchar(90), ");
		sql.append("age int)");
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.execute(sql.toString());
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
