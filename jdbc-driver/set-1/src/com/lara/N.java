package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class  N
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();		
		String s2 = "insert into person values(100,'abc',33)";
		String s3 = "insert into employee values(100,'abc','b',34)";
		String s4 = "update person set name = 'hello' where id = 2";
		String s5 = "delete from employee where id =5";
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		stmt.execute(s5);
		System.out.println("done!");
	}
}
