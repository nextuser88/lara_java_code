package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Savepoint;

public class Manager3
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		Savepoint p1 = null;

		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			//con.setAutoCommit(false);
			String s1 = "insert into employee(sno, name, age)values(40,'abc', 22)";
			String s2 = "insert into employee(sno, name, age)values(50,xyz', 24)";
			String s3 = "insert into employee(sno, name, age)values(60,'hello', 26)";
			stmt.executeUpdate(s1);
			p1 = con.setSavepoint("p1");
			stmt.executeUpdate(s2);
			stmt.executeUpdate(s3);
			
			System.out.println("done");
				
						
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		try
		{
			con.rollback(p1);
		}
		
		catch (SQLException ex1)
		{
			ex1.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null,stmt,con);
		}
	}
}
