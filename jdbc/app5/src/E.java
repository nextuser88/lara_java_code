import java.sql.*;
import java.util.*;
class E
{
	public static void main(String[] args) 
	throws Exception
	{
		Statement stmt = Util.getStatement();
		Scanner sc = new Scanner(System.in);
		String id, name, sql, decider;
		do
		{
			System.out.println("enter id ");
			id = sc.next();
			System.out.println("enter name ");
			name = sc.next();
			sql = "insert into tab2 values(" + id + ", '" + name + "')";
			stmt.execute(sql);
			System.out.println("one more record ?(y/n)");
			decider = sc.next();
		}
		while ("y".equals(decider));
		System.out.println("done");
	}
}
