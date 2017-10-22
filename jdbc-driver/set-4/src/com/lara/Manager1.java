package com.lara;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;

public class Manager1
{
	public static void main(String[] args)
	{
		Connection con = null;
		PreparedStatement pstmt = null;

		try
		{
			con = DbUtil.getConnection();
			pstmt = con.prepareStatement("insert into employee(sno, name,age) values(?,?,?)");
			ParameterMetaData pMetaData = pstmt.getParameterMetaData();
			pstmt.setInt(1,2000);
			pstmt.setString(2,"abc");
			pstmt.setInt(3,78);
			int count = pMetaData.getParameterCount();
			System.out.println(count);
			pstmt.executeUpdate();
			System.out.println("done");
						
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			DbUtil.closeAll(null,pstmt,con);
		}
	}
}
