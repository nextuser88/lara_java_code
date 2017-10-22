package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class F4
{
	public static void main(String [] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = EUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "create sequence tab2_seq start with 1 increment by 1";
			stmt.execute(s1);
			System.out.println("HI! you saved my life .. ");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		EUtil.closeStatement(stmt);
		EUtil.closeConnection(con);
		}
	}
}
