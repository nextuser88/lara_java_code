package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;


public class  O
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();		
		String s1 = "select * from person";
		ResultSet rs = stmt.executeQuery(s1);
		while(rs.next())
		{
		System.out.println(rs.getInt("id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
		System.out.println("------------");
		}
		System.out.println("done!");
	}
}
