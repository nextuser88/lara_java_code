package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class  F3
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = EUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "create table tab2(sno int, name varchar(90), age int)";
			stmt.execute(s1);
			System.out.println("Hi! CONGRATS... YOU MADE IT  :)");
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
