package com.lara;
import java.sql.*;
class  E
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
		String sql = "select * from student1";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("\t\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getInt(3));
				System.out.println("\t\t" + rs.getString(4));
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(rs != null)
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
		System.out.println("done");
	}
}
