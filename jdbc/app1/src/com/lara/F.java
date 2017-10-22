package com.lara;
import java.sql.*;

class F 
{
	public static void main(String[] args) 
	throws Exception
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		String s1 = "update emp set name = 'changed' where id > 4";
		String s2 = "delete from emp where id < 3";
		String s3 = "insert into emp values(10, 'raghu', 33)";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		System.out.println("done!");
	}
}
