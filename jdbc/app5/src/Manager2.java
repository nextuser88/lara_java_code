import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Manager2
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
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getInt("age") + "\t");
			System.out.println(rs.getString("email"));
		}
	}
}
