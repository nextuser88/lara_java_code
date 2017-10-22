package com.lara;
import java.sql.*;
class Q
{
	public static void main(String[] args) 
	{
		String s1 = "create or replace procedure p2 " + 
					"as begin " + 
					"insert into student1 values(30, 'abc', 22, 'a@a.com'); " +
					"insert into student1 values(31, 'xyz', 24, 'z@z.com'); " +
					"update student1 set name ='bharath' where id= 22; " +
					"delete from student1 where id= 24; " +
					"delete from student2 where id< 2; " +
					"end;";
		Connection con = null;
		Statement stmt = null;
//		to create stored procedure use stmt or pstmt but not callable statement. ctmt is used for giving a call to stroed procedure
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
