package com.lara;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class  W
{
	public static void main(String[] args) throws Exception 
	{
		
		Statement stmt = EUtil.getStatement();		
		Scanner sc = new Scanner(System.in);
		ResultSet rs = null;
		String key,sql,decider;
		do
		{
			System.out.println("Enter Search Key");
			key = sc.next();
			sql = "select * from employee where first_name like '%"+key+"%' or last_name like '%"+key+"%'";
			rs = stmt.executeQuery(sql);
			boolean flag = true;
		
		while (rs.next())
			{
				if(flag)
				{
					flag = false;
					System.out.println("Search Result to: " +key);
					System.out.println("====================" );
				}
				System.out.print(rs.getInt("Id"));
				System.out.print("," + rs.getString("first_name"));
				System.out.print(","+ rs.getString("last_name"));
				System.out.println(","+ rs.getInt("age"));
			}
		
		if(flag)
			{
		System.out.println("no result found to: "+key);
			}
		System.out.println("search again(y/n)?");
				decider = sc.next();
		}
				while("y".equals(decider));
				System.out.println("end of game");
	}
}
