package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Savepoint;

public class Manager4
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs  = null;

		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			
			String s1 = "insert into emp(sno, name)values(1,'abc')";
			stmt.executeUpdate(s1, Statement.RETURN_GENERATED_KEYS);
			rs = stmt.getGeneratedKeys();
			String rowid = null;
			if(rs.next())
			{
				rowid = rs.getString(1);
			}
			String s2 = "update emp set r_id = '"+rowid+"' where sno =1";
			stmt.executeUpdate(s2);
			System.out.println("done");
				
						
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
		
		
		finally
		{
			DbUtil.closeAll(null,stmt,con);
		}
	}
}
