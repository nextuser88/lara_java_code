package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class  U
{
	public static void main(String[] args) throws Exception 
	{
		
		String s1 = "select * from person where ID = 200";
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
		System.out.print(","+ rs.getString(2));
		System.out.println(","+ rs.getInt("age"));
		}
		if(flag)
		{
		System.out.println("no record to your search!");
		}
	}
}
