package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager1
{
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try
		{
			con = DbUtil.getConnection();
			stmt = con.createStatement();
			String s1 = "CREATE TABLE EMPLOYEE(SNO INT, NAME VARCHAR(90), AGE INT,PIC BLOB, CONSTRAINT EP1 PRIMARY KEY(SNO))";
			stmt.execute(s1);
			String s2 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(1,'ramu',25)";
			String s3 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(2,'vijay',42)";
			String s4 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(3,'pavan',62)";
			String s5 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(4,'manu',25)";
			String s6 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(6,'naveen',32)";
			//String s7 = "INSERT INTO EMPLOYEE(SNO,NAME,AGE)VALUES(6,'naik',24)";
			stmt.execute(s2);
			stmt.execute(s3);
			stmt.execute(s4);
			stmt.execute(s5);
			stmt.execute(s6);
			//stmt.execute(s7);
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
