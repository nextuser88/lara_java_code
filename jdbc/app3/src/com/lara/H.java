package com.lara;
import java.sql.*;

class  H
{
	public static void main(String[] args) 
	{
		String sql = "select * from student2 ";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print("\t\t" + rs.getString(2));
				System.out.println("\t\t" + rs.getInt(3));
			}
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeAll(rs, stmt, con);
		}
		System.out.println("done");
	}
}
