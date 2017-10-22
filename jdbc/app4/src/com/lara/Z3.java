package com.lara;
import java.sql.*;
class  Z3
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p6( ? )}");
			cstmt.setInt(1, 5);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			int age  = cstmt.getInt(1);
			System.out.println("age: " + age);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			Util.closeResources(null, cstmt, con);
		}
		System.out.println("done");
	}
}
