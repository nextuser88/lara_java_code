package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class D
{
	public static void main(String args[])
  {
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch (ClassNotFoundException ex)
	{
		ex.printStackTrace();
	}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

	try
	{
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
		stmt = con.createStatement();
		String s1 = "select * from employee";
		rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		while(rs.next())
		{
		for(int i =1; i<=cols; i++)
			{
				System.out.println(rs.getString(i)+", ");
			}
			System.out.println();
		}

	}
	catch (SQLException ex)
	{
		ex.printStackTrace();
	}
	finally 
	  {
		try
		{
			if(rs!=null)
			{
			rs.close();
			rs = null;
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		try
		{
			if(stmt!=null)
			{
			stmt.close();
			stmt = null;
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		try
		{
			if(con!=null)
			{
			con.close();
			con = null;
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	  }
  }
}
