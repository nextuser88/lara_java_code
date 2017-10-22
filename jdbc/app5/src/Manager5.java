import java.sql.*;

public class Manager5
{
	public static void main(String[] args)
	throws Exception
	{
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		String sql = "select * from student1";
		ResultSet rs = stmt.executeQuery(sql);
		//if sql command is select command then we have to use executeQuery.
		while(rs.next())
		{
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.println(rs.getString("email"));
		}
	}
}
