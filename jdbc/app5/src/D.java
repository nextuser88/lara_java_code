import java.sql.*;
import java.util.*;
class D 
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id ");
		int id = sc.nextInt();
		System.out.println("enter name ");
		String name = sc.next();
		String sql = "insert into tab2 values(" + id + ", '" + name + "')";
		stmt.execute(sql);
		System.out.println("done");
	}
}
