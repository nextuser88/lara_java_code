package com.lara;
import java.sql.*;

class D
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
		String sql = "insert into student1 ";
		sql += "values(2, 'xyz', 24, 'a@b.com')";
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt = con.createStatement();
			int status = stmt.executeUpdate(sql);
			System.out.println(status);
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
		System.out.println("done");
	}
}
