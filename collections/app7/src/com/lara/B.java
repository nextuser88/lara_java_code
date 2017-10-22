package com.lara;
import java.io.FileReader;
import java.util.Properties;
public class  B
{
	public static void main(String[] args) 
	throws Exception
	{
		FileReader reader = new FileReader("test.properties");
		Properties pr = new Properties();

		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("age"));
		System.out.println(pr.getProperty("education"));
		System.out.println(pr.getProperty("address"));
		pr.load(reader);
		System.out.println("after loading...");
		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("age"));
		System.out.println(pr.getProperty("education"));
		System.out.println(pr.getProperty("address"));
	}
}
