package com.lara;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class  Z1
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select * from employee";		
		Statement stmt  = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		ResultSetMetaData rsmd = rs.getMetaData();
		int cols = rsmd.getColumnCount();
		String name, value;
		while(rs.next())
		{
		
		for(int i = 1; i<=cols; i++)
		{
			name = rsmd.getColumnName(i);
			value = rs.getString(i);//value from resultSet
			System.out.print(name+": "+value+", ");
		

		}
		
		}
		
	}
}
