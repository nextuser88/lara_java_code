package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Manager18
{
		
	public static void main(String[] args) 
	{
	Connection con = null;
	Statement stmt = null;
		
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String sql = "create table emp (sno int, name varchar(90), age int, salary int)";			
			stmt.execute(sql);
			System.out.println("done");
		}
			
		catch (SQLException ex)
		{
			ex.printStackTrace();
		
		}
		finally
		{
		DbUtil.closeAll(null, stmt, con);
		}
	}
}
