package com.lara;
import java.sql.*;
import java.io.*;

class F  
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		FileReader fin = new FileReader("text.txt");
		BufferedReader bin = new BufferedReader(fin);
		String line = bin.readLine();
		String data[], id, name, age, email, sql;
		while(line != null)
		{
			data = line.split(",");
			id = data[0].trim();
			name = data[1].trim();
			age = data[2].trim();
			email = data[3].trim();
			sql = "insert into student values("+ id +", '" + name + "', "+ age +", '"+ email +"')";
			stmt.execute(sql);
			line = bin.readLine();
		}
		System.out.println("done!");
	}
}
