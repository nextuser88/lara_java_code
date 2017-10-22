package com.lara;
import java.sql.*;
public class A
{
	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
		Statement stmt = con.createStatement();
		String sql = "create table person(sno int, first_name varchar(90), age int)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
