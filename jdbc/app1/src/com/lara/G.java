package com.lara;
import java.sql.*;

class G 
{
	public static void main(String[] args) 
	throws Exception
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		String sql  = "select * from emp";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())//bringing the cursor on the next record.
		{
			System.out.print(rs.getInt("id")+ ", ");
			System.out.print(rs.getString("name")+ ", ");
			System.out.println(rs.getInt("age"));
		}

		System.out.println("done!");
	}
}
