package com.lara;
import java.sql.*;
class Y
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			StringBuffer sql = new StringBuffer();
			sql.append("create or replace ");
			sql.append("procedure p5( ");
			sql.append("arg1 in int, ");
			sql.append("arg2 out int, ");
			sql.append("arg3 out varchar) ");
			sql.append("as begin ");
			sql.append("select age into arg2 from student1 where id = arg1;");
			sql.append("select email into arg3 from student1 where id = arg1;");
			sql.append("end;");
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
