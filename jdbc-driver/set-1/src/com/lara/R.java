package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;


public class  R
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();		
		String s1 = "select * from employee";
		ResultSet rs = stmt.executeQuery(s1);
		while(rs.next())
		{
		System.out.print(rs.getInt("Id"));
		System.out.print(","+ rs.getString("first_name"));
		System.out.print(","+ rs.getString(3));
		System.out.println(","+ rs.getInt(4));
		}
		System.out.println("done!");
	}
}
