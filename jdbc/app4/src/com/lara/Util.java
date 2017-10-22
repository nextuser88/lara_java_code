package com.lara;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Util 
{
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	static
	{
		Properties pr = new Properties();
		FileReader fin = null;
		try
		{
			fin = new FileReader("test.properties");
			pr.load(fin);
			driverClass = pr.getProperty("driver");
			url = pr.getProperty("url");
			username = pr.getProperty("username");
			password = pr.getProperty("password");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				if(fin != null)
				{
					fin.close();
					fin = null;
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	static 
	{
		try
		{
			Class.forName(driverClass);
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	public static Connection getConnection()
	throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
	}
	public static void closeResources(ResultSet rs, Statement stmt, Connection con)
	{
		try
		{
			if(rs != null)
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
			if(stmt != null)
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
			if(con != null)
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
