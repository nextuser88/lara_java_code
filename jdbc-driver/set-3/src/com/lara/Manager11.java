package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.uti.Arrays;

public class Manager12
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
			rs = stmt.executeQuery("Select sno, name, age from employee");
			//System.out.println("Reading 2nd row");
			String s1 = "INSERT INTO EMPLOYEE(SNO, NAME, AGE) VALUES(7,'PRAVEEN',44)";
			String s2 = "INSERT INTO EMPLOYEE(SNO, NAME, AGE) VALUES(8,'PRANAV',45)";
			String s3 = "UPDATE EMPLOYEE SET NAME = 'SOMETHING' WHERE SNO =2";
			String s4 = "DELETE FROM EMPLOYEE WHERE SNO =3";
			stmt.addBatch(s1);
			stmt.addBatch(s2);
			stmt.addBatch(s3);
			stmt.addBatch(s4);
			int[] result = stmt.executeBatch();
			System.out.println(Arrays.toString(result));
			System.out.println("--------");
			while(rs.next())
			{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
			}
			
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
