package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class F

{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = EUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab1 values(1,'abc', 'a@a.com')";
			stmt.execute(s1);
			System.out.println("done!");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		finally
		{
		EUtil.closeStatement(stmt);
		EUtil.closeConnection(con);
		}
	}
}
