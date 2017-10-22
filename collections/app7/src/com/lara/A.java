package com.lara;
import java.io.FileReader;
import java.util.Properties;
public class  A
{
	public static void main(String[] args) 
	throws Exception
	{
		FileReader reader = new FileReader("test.properties");
		Properties pr = new Properties();

		System.out.println(pr);
		pr.load(reader);
		System.out.println(pr);
	}
}
