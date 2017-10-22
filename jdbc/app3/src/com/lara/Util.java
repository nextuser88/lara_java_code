package com.lara;
import java.sql.*;
class  Util
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
	public static Connection getConnection()
	throws SQLException	
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","123");

	}
	public static void closeAll(ResultSet rs, Statement stmt, Connection con)
	{
		if(rs!= null)
		{
			try
			{
				rs.close();
				rs = null;
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(stmt != null)
		{
			try
			{
				stmt.close();
				stmt = null;
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		if(con != null)
		{
			try
			{
				con.close();
				con = null;
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}

	}
}
