package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A

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

	
	try
	{
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
		stmt = con.createStatement();
		String s1 = "create table tab1(sno int , f_name varchar(90), email varchar(90))";
		stmt.execute(s1);
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