package com.lara;
import java.sql.*;
class  V
{
	public static void main(String[] args) 
	{
		StringBuffer sql = new StringBuffer();
		sql.append("create or replace ");
		sql.append("procedure p4(arg1 out int) ");//argument type in/out bydefalut in-type.
		sql.append("as begin ");
		sql.append("select age into arg1 from student1 where id = 2;");
		sql.append("end;");
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt= con.createStatement();
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
