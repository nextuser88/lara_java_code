package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EUtil 
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		
		
	}
	public static Connection getConnection() throws SQLException
	{
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");		
		return con;
	}
	public static void closeResultSet(ResultSet rs)
	{
		try
		{
			if(rs!=null)
			{
			rs.close();
			
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void closeStatement(Statement stmt)
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
	}
	public static void closeConnection(Connection con)
	{
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
