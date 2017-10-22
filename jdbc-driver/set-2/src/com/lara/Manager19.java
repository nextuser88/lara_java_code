package com.lara;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class Manager19
{
		
	public static void main(String[] args) 
	{
	Connection con = null;
	Statement stmt = null;
		
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			StringBuffer sb = new StringBuffer();
			sb.append("create or replace procedure p1 ");
			sb.append("as begin ");
			sb.append("insert into emp values(1,'abc',22, 80000); ");
			sb.append("insert into emp values(2,'xyz',32, 10000); ");
			sb.append("insert into emp values(3,'hello',23, 30000); ");
			sb.append("insert into emp values(4,'test',42, 60000); ");
			sb.append("end; ");
			stmt.execute(sb.toString());
			System.out.println(sb);
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
 

	