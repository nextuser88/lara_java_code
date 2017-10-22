package com.lara;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Manager12
{
		
	public static void main(String[] args) 
	{

	Connection con = null;
	PreparedStatement pstmt = null;
		
		try
		{
			con = Manager3.getConnection();
			pstmt = con.prepareStatement("insert into tab3 values(?,?)");			
			Scanner sc = new Scanner(System.in);
			String sno, name, decider;
			do
			{
				System.out.println("Enter sno");
				sno = sc.next();
				pstmt.setInt(1,Integer.parseInt(sno));
				System.out.println("Enter name");
				name = sc.next();
				pstmt.setString(2,name);
				pstmt.executeUpdate();
				System.out.println("again(y/n)");
				decider = sc.next();
			}
			while ("y".equals(decider));
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		
		}
		finally
		{
		Manager3.closeAll(null, pstmt, con);
		}
	}
}
