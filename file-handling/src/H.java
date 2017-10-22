import java.io.*;
import java.util.*;
class  H
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("C.java");
		FileInputStream fin2 = new FileInputStream("f2.txt");
		FileInputStream fin3 = new FileInputStream("abc.txt");
		FileInputStream fin4 = new FileInputStream("f1.txt");

		Vector v = new Vector();
		v.add(fin);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		Enumeration e = v.elements();
		SequenceInputStream bin = new SequenceInputStream(e);
		int i = 0;
		while((i = bin.read()) != -1)
		{
			System.out.print((char)i);	
		}
		bin.close();
		fin.close();
		fin2.close();
		
	}
}
