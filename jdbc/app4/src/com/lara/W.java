package com.lara;
import java.sql.*;
class W 
{
	public static void main(String[] args) 
	{
		Connection con  = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p4(?)}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			int age = cstmt.getInt(1);
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
