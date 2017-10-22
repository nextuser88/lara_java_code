package com.lara;
import java.sql.*;
class  Z1
{
	public static void main(String[] args) 
	{
		Connection con = null;
		CallableStatement cstmt = null;
		try
		{
			con = Util.getConnection();
			cstmt = con.prepareCall("{call p5(?, ?, ?)}");
			cstmt.setInt(1, 4);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.execute();
			int age  = cstmt.getInt(2);
			String email = cstmt.getString(3);
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
