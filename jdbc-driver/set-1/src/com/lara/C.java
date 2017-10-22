package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class C

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
		String s1 = "select * from person";
		rs = stmt.executeQuery(s1);
		while(rs.next())
		{
		System.out.print(rs.getInt(1)+",");
		System.out.print(rs.getString(2)+",");
		System.out.print(rs.getInt(3)+",");
		}
		System.out.println("done");
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