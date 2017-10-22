package com.lara;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.Properties;
import java.util.Arrays;
import java.sql.SQLException;
import java.util.Set;
public class  L
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();
		FileReader fin = new FileReader("test3.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		String s2[],sql;
		while(s1!=null)
		{
		s2 = s1.split("\\|");
		sql = "insert into employee values("+s2[0].trim()+",'"+s2[1].trim()+"','"+s2[2].trim()+"',"+s2[3].trim()+")";
		stmt.execute(sql);
		s1 = bin.readLine();
		}
		System.out.println("done");
		
	}
}
