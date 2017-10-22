package com.lara;
import java.sql.*;
class Z2
{
	public static void main(String[] args)
	{
		StringBuffer sql = new StringBuffer();
		
			sql.append("create or replace ");
			sql.append("procedure p6 ");
			sql.append("(arg1 in out int) ");
			sql.append("as begin ");
			sql.append("select age into arg1 from student1 where id = arg1;");
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
	}
}