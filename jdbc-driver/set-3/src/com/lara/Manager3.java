package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Manager3
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("Select * from employee");
			System.out.println("In the forward direction ");
			while(rs.next())
			{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
			}
			System.out.println("--------");
			rs.beforeFirst();
			System.out.println("In the forward Direction");
			while(rs.next())
			{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
			}
			System.out.println("done");
			
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null,stmt,con);
		}
	}
}
