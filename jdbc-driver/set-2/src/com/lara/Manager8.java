package com.lara;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Manager8
{
	
	
	public static void main(String[] args) 
	{

	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;
	String sno, name, sql, decider;
		
		try
		{
			con = Manager3.getConnection();
			stmt = con.createStatement();
			do
			{
			
			System.out.println("Enter sno");
			sno = sc.next();
			System.out.println("Enter name");
			name = sc.next();
			sql = "insert into tab3 values("+ sno +", '"+name+"')";
			stmt.executeUpdate(sql);
			System.out.println("insert again(y/n)?");
			decider = sc.next();
			}
			while("y".equals(decider));
		
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		
		}
		finally
		{
		Manager3.closeAll(null, stmt, con);
		}
	}
}
