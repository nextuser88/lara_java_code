import java.sql.*;
class C
{
	public static void main(String[] args) 
	throws Exception
	{
		if(args.length != 2)
		{
			System.out.println("supply cla");
			System.out.println("java C 2 bhanu");
			return;
		}
		Statement stmt = Util.getStatement();
		String sql = "insert into tab2 values(" + args[0] + ", '" + args[1] + "')";
		stmt.execute(sql);
		System.out.println("done");
	}
}
