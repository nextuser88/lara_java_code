package com.lara;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class  Y
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select first_name as fname from employee";
		Statement stmt = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		while(rs.next())
		{
			//System.out.print(rs.getInt("ID"));
			System.out.println(rs.getString("fname"));
		}
		System.out.println("done");
	}
}
