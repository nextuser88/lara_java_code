package com.lara;
import java.sql.*;
class  B
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt  = Util.getStatement();
		String s1 = "insert into student values(1, 'ramu', 22, 'r@r.com')";
		stmt.execute(s1);
		System.out.println("done");
	}
}
