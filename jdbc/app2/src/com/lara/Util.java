package com.lara;
import java.sql.*;

class Util
{
	public static Statement getStatement()
	throws Exception
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		return stmt;
	}

}
