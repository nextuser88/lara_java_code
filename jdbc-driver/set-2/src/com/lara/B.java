package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class  B
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = AUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "insert into tab2 values(tab2_seq.nextval, 'xyz', 33)";
			int i = stmt.executeUpdate(s1);
			System.out.println(i);
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			AUtil.closeStatement(stmt);
			AUtil.closeConnection(con);
		}
		
	}
}
