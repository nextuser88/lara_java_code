package com.lara;
import java.io.FileReader;
import java.io.BufferedReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.*;

public class  M
{
	public static void main(String[] args) throws Exception 
	{
		Statement stmt = EUtil.getStatement();
		String s1 = "update employee set first_name = 'changed' where id = 8";
		stmt.execute(s1);		
		System.out.println("done!");
	}
}
