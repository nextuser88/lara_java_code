package com.lara;
import java.sql.*;
class G
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

			while(rs.next())
			{
				
				for(int i = 1; i <= cols; i++)
				{
					System.out.print("\t" + rs.getString(i));	
				}
				System.out.println();	
			}
			
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
