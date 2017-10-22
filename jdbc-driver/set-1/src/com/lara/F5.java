package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class  F5
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement stmt = null;
		try{

		con = EUtil.getConnection();
		stmt = con.createStatement();
		String s1 = "insert into tab2 values(tab2_seq.nextval,'abc',22)";
		int status = stmt.executeUpdate(s1);
		System.out.println(status);
		}
		catch(SQLException ex)
		{
		   ex.printStackTrace();
		}
		finally
		{
		EUtil.closeStatement(stmt);
		EUtil.closeConnection(con);
		}

	}
}
