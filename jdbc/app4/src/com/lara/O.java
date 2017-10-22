package com.lara;
import java.sql.*;

class O 
{
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("create or replace procedure pr1 ");
		sql.append("as begin ");
		sql.append("insert into student1 values(20, 'Ramu', 22, 'r@gmail.com'); ");
		sql.append("insert into student1 values(21, 'bhanu', 29, 'b@gmail.com'); ");
		sql.append("insert into student1 values(22, 'Raghu', 24, 'rg@gmail.com'); ");
		sql.append("insert into student1 values(23, 'naveen', 23, 'n@gmail.com'); ");
		sql.append("insert into student1 values(24, 'swathi', 22, 's@gmail.com'); ");
		sql.append("end;");
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
