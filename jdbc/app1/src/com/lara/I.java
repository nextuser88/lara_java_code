package com.lara;
import java.sql.*;
class  I
{
	public static void main(String[] args) 
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t\t" + rs.getInt(3));
		}
		System.out.println();
		System.out.println("done");
	}
}
