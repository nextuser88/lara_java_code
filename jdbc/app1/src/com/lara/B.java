package com.lara;
import java.sql.*;

public class B 
{
	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","123");
		Statement stmt = con.createStatement();
		String sql = "create table p1(sno int)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
