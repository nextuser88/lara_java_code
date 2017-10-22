package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager4
{


	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Manager3.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab3 values(3, 'hello')";
			stmt.executeUpdate(s1);
			System.out.println("done");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		Manager3.closeAll(null, stmt, con);
		}
	}
}
