package com.lara;
import java.sql.*;
class  Z
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p5(3, ?, ?)}");
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.execute();
			int age  = cstmt.getInt(1);
			String email = cstmt.getString(2);
			System.out.println("age: "+  age);
			System.out.println("email: "+  email);
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
