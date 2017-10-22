import java.sql.*;
import java.util.*;
class  Util
{
	public static Statement getStatement()
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
		Statement stmt = con.createStatement();
		return stmt;
	}
}
