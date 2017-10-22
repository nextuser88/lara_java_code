package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Arrays;

public class Manager14
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			
			//System.out.println("Reading 2nd row");
			stmt.addBatch("insert into employee(sno, name)values(10,'xyz')");
			stmt.addBatch("insert into employee values(11, 'abc')");
			int[] results = stmt.executeBatch();
			System.out.println(Arrays.toString(results));
			System.out.println("--------");
			
			
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
