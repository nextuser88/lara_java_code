package com.lara;
import java.sql.*;
class  A
{
	public static void main(String[] args) 
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
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt = con.createStatement();
			StringBuffer sql = new StringBuffer();
			sql.append("create table person1 ");
			sql.append("(id int, ");
			sql.append("name varchar(90), ");
			sql.append("age int, ");
			sql.append("email varchar(90))");
			stmt.execute(sql.toString());

		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
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
		System.out.println("done");		
	}
}
