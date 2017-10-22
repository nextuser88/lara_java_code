package com.lara;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class  X
{
	public static void main(String[] args) throws Exception 
	{
		String s1 = "select * from person";
		Statement stmt = EUtil.getStatement();
		ResultSet rs = stmt.executeQuery(s1);
		while(rs.next())
		{
			System.out.print(rs.getInt("ID"));
			System.out.println("," +rs.getString(2));
		}
		System.out.println("end of game");
	}
}
