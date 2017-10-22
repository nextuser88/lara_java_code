package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Arrays;

public class Manager13
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
			stmt.addBatch("insert into employee(sno, name)values(9,'abc')");
			stmt.addBatch("insert into tab2(name)values('abc')");
			stmt.addBatch("update employee set name = 'abc' where sno =20");

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
