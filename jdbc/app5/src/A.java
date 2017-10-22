import java.sql.*;
class A
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		String sql = "create table tab2(id int, name varchar(90))";
		stmt.execute(sql);
		System.out.println("done");
	}
}
