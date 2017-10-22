package com.lara;
import java.sql.*;
class  D
{
	public static void main(String[] args) 
	throws Exception
	{
		if(args.length != 4)
		{	
			System.out.println("supply 4 command line arguments");
			System.out.println("java com.lara.D arg0 arg1 arg2 arg3");
			return;
		}
		String id = args[0];
		String name = args[1];
		String age = args[2];
		String email = args[3];
		String sql = "insert into student values("+ id +", '"+ name +"', " + age + ", '" + email + "')";
		Statement stmt = Util.getStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}
//java com.lara.D 1 abc 22  a@a.com