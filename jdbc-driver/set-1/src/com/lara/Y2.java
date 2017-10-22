package com.lara;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class  Y2
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select ID as s_no, name as f_name from person";
		
		Statement stmt  = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int cols = rsmd.getColumnCount();
		for(int i = 1; i<=cols; i++)
		{
			System.out.println(rsmd.getColumnName(i));
		}
		
	}
}
