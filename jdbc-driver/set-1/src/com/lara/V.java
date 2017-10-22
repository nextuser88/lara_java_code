package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class  V
{
	public static void main(String[] args) throws Exception 
	{
		
		String s1 = "select * from employee where first_name like '%b%'";
		Statement stmt = EUtil.getStatement();		
		ResultSet rs = stmt.executeQuery(s1);
		boolean flag = true;
		while(rs.next())
		{
			if(flag)
			{
				flag = false;
			}
		
		System.out.print(rs.getInt("ID"));
		System.out.print(","+ rs.getString("first_name"));
		System.out.print(","+ rs.getString("last_name"));
		System.out.println(","+ rs.getInt("age"));
		}
		if(flag)
		{
		System.out.println("no record to your search!");
		}
	}
}
