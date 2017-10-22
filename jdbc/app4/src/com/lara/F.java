package com.lara;
import java.sql.*;
class F
{
	public static void main(String[] args) 
	{
		String sql = "select * from employee";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			System.out.println("cols: " + cols);
			for(int i = 1; i <= cols; i++)
			{
				System.out.print("\t" + rsmd.getColumnName(i));	
				
			}
			System.out.println();
			while(rs.next())
			{
				System.out.print("\t"+ rs.getString(1));
				System.out.print("\t"+ rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.println("\t" + rs.getString(4));
			}
			System.out.println("------------------------------");	
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(rs, stmt, con);
		}
		System.out.println("done");
	}
}
