package com.lara;
import java.sql.*;

public class H 
{
	public static void main(String[] args) 
	{
		String s1 = "insert into student1 values(3,'vijay', 29, 'v@gmail.com')";
		String s2 = "insert into student1 values(4,'bhanu', 24, 'b@gmail.com')";
		String s3 = "insert into student1 values(5,'navee', 45, 'n@gmail.com')";
		String s4 = "insert into student1 values(6,'kiran', 23, 'k@gmail.com')";
		String s5 = "insert into student1 values(7,'ramana', 35, 'r@gmail.com')";
		//for all bulk opeation use prepared statement rather statement object.
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(s1);
			stmt.executeUpdate(s2);
			stmt.executeUpdate(s3);
			stmt.executeUpdate(s4);
			stmt.executeUpdate(s5);
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
