package com.lara;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class  Z
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select * from employee";
		
		Statement stmt  = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		while(rs.next())
		{
		
		for(int i = 1; i<=cols; i++)
		{
			System.out.print(rs.getString(i)+ ",");
		}
		System.out.println();
		}
		
	}
}
