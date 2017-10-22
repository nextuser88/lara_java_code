package com.lara;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager6
{


	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			con = Manager3.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab3 values(4,'ramu')";
			String s2 = "insert into tab3 values(5,'vijay')";
			stmt.executeUpdate(s1);
			System.out.println("one query done");
			stmt.executeUpdate(s2);
			System.out.println("2 query done");

			
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
