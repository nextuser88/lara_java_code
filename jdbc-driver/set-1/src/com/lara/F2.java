package com.lara;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class  F2
{
	public static void main(String[] args) 
	{
		Connection con =null;
		
		try
		{
			con = EUtil.getConnection();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		EUtil.closeConnection(con);
		}
		
	}
}
