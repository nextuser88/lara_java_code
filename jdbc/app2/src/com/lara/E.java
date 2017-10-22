package com.lara;
import java.sql.*;
import java.util.*;

class E 
{
	public static void main(String[] args) 
	throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		String id = sc.next();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter age");
		String age = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		StringBuffer sql = new StringBuffer();
		sql.append("insert into student ");
		sql.append("values (");
		sql.append(id + ", ");
		sql.append("'" + name + "', ");
		sql.append(age + ", ");
		sql.append("'" + email + "')");
		System.out.println(sql);
		Statement stmt = Util.getStatement();
		stmt.execute(sql.toString());
		System.out.println("done");
	}
}
