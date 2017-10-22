package com.lara;
import java.sql.*;
class G 
{
	public static void main(String[] args) 
	{
		String sql = "insert into student2 ";
		sql += "values(1, 'abc', 22)";
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println(i);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeAll(null, stmt, con);
		}
		System.out.println("done");
	}
}
