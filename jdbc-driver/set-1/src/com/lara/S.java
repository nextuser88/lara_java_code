package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;


public class  S
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();		
		String s1 = "select first_name,id,age from employee";
		ResultSet rs = stmt.executeQuery(s1);
		while(rs.next())
		{
		
		System.out.print(rs.getString(1));
		System.out.print(","+ rs.getInt(2));
		System.out.println(","+ rs.getInt(3));
		}
		System.out.println("done!");
	}
}
