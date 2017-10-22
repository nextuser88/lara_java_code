package com.lara;
import java.sql.*;

class E
{
	public static void main(String[] args) 
	throws Exception
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		String s1 = "insert into emp values(2, 'ramu', 22)";
		String s2 = "insert into emp values(3, 'bhanu', 29)";
		String s3 = "insert into emp values(4, 'naveen', 42)";
		String s4 = "insert into emp values(5, 'swathi', 26)";
		String s5 = "insert into emp values(6, 'panav', 21)";
		String s6 = "insert into emp values(7, 'naresh', 32)";
		String s7 = "insert into emp values(8, 'rekha', 25)";
		Class.forName(driverClass);
		Connection con  = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		stmt.execute(s4);
		stmt.execute(s5);
		stmt.execute(s6);
		stmt.execute(s7);
		System.out.println("done");
	}
}
