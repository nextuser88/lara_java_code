package com.lara;
import java.sql.*;
class  C
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt  = Util.getStatement();
		String s1 = "insert into student values(2, 'abc', 23, 'a@a.com')";
		String s2 = "insert into student values(3, 'vishnu', 21, 'a@r.com')";
		String s3 = "insert into student values(4, 'bhanu', 29, 'a@s.com')";
		String s4 = "insert into student values(5, 'manu', 236, 'd@a.com')";
		String s5 = "insert into student values(6, 'swapna', 24, 'f@a.com')";
		String s6 = "insert into student values(7, 'vijay', 25, 'g@h.com')";
		String s7 = "insert into student values(8, 'naveen', 24, 'i@j.com')";
		String s8 = "insert into student values(9, 'hero', 27, 'k@l.com')";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		stmt.execute(s5);
		stmt.execute(s6);
		stmt.execute(s7);
		stmt.execute(s8);
		System.out.println("done");
	}
}
