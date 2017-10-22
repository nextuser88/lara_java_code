package com.lara;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.Properties;
import java.util.Set;
public class  I
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();
		Properties pr = new Properties();
		FileReader fin = new FileReader("test2.properties");
		pr.load(fin);
		Set<String> keys = pr.stringPropertyNames();
		String value;
		for(String key:keys)
		{
		value = pr.getProperty(key);
		stmt.execute(value);
		}
		System.out.println("done");
		
	}
}
