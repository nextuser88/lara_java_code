package com.lara;
import java.sql.*;

public class C 
{
	public static void main(String[] args) 
	throws Exception
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		String sql = "create table emp(id int, name varchar(90), age int)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
