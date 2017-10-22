package com.lara;
import java.sql.*;
class H 
{
	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from emp");
		while(rs.next())
		{
			System.out.print(rs.getString("id"));
			System.out.print("\t" + rs.getString("name"));
			System.out.println("\t\t" + rs.getString("age"));
		}
		System.out.println("done!");
	}
}
