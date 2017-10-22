package com.lara;
import java.sql.*;
import java.io.*;
class G 
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		FileReader fin = new FileReader("test1.txt");
		BufferedReader bin = new BufferedReader(fin);
		String fields[], id, name, age, email;
		StringBuffer sql;
		String line = bin.readLine();
		while(line != null)
		{
			fields = line.split("\\|");
			id = fields[0].trim();
			name = fields[1].trim();
			age = fields[2].trim();
			email = fields[3].trim();
			sql = new StringBuffer();
			sql.append("insert into student ");
			sql.append("values (");
			sql.append(id + ", ");
			sql.append("'" + name + "', ");
			sql.append(age + ", ");
			sql.append("'" + name + "')");
			stmt.execute(sql.toString());
			line = bin.readLine();
		}
		System.out.println("done!");
	}
}
