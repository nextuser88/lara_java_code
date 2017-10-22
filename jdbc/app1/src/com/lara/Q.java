package com.lara;
import java.sql.*;

class Q
{
	public static void main(String[] args) 
	throws Exception
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		String sql = "Select name f_name, age, id from emp";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			System.out.print(rs.getString(3));
			System.out.print(", " + rs.getString(2));
			System.out.println(", " + rs.getString(1));
			System.out.println("---------------");
		}
		System.out.println();
		System.out.println("done");
	}
}
