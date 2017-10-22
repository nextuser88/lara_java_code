import java.sql.*;
import java.io.*;

class G 
{
	public static void main(String[] args) 
	throws Exception
	{
		File f1 = new File("test.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		Statement stmt = Util.getStatement();
		String row, rowData[], id, name, sql;
		row = bin.readLine();
		while(row != null)
		{
			rowData = row.split(",");
			id = rowData[0];
			name = rowData[1];
			sql = "insert into tab2 values(" + id + ", '" + name + "')";
			System.out.println(sql);
			stmt.execute(sql);
			row = bin.readLine();
		}
		System.out.println("done");
	}
}
