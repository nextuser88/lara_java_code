package com.lara;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class  Y1
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select * from employee";
		Statement stmt = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int cols = rsmd.getColumnCount();
		
		String c1 = rsmd.getColumnName(1);
		String c2 = rsmd.getColumnName(2);
		String c3 = rsmd.getColumnName(3);
		String c4 = rsmd.getColumnName(4);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(cols);


	}
}
