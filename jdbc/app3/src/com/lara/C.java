package com.lara;
import java.sql.*;

class C
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
		StringBuffer sql = new StringBuffer();
		sql.append("insert into student1 ");
		sql.append("values (");
		sql.append("1, 'abc', 22, 'a@a.com')");
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt = con.createStatement();
			stmt.executeUpdate(sql.toString());//for all DML commands
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		finally
		{
			try
			{
				if(stmt != null)
				{
					stmt.close();
					stmt = null;
				}
			}
			catch(SQLException ex)
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
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("record inserted successfully..");
	}
}
