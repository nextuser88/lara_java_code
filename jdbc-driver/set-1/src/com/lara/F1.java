package com.lara;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class F1

{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = EUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "select * from person";
			rs = stmt.executeQuery(s1);
			while(rs.next())
			{
			System.out.print(rs.getString(1)+", ");
			System.out.print(rs.getString(2)+ ", ");
			System.out.println(rs.getString(3)+", ");
			}
			System.out.println("done!");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}

		finally
		{
		EUtil.closeResultSet(rs);
		EUtil.closeStatement(stmt);
		EUtil.closeConnection(con);
		}
	}
}
