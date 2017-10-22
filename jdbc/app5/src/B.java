import java.sql.*;
class B
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		String sql = "insert into tab2 values(1, 'vijay')";
		stmt.execute(sql);
		System.out.println("done");
	}
}
