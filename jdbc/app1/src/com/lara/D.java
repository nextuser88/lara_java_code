package com.lara;
import java.sql.*;
class D 
{
	public static void main(String[] args) 
	throws Exception
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		String sql = "insert into emp values(1, 'abc', 22)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}
