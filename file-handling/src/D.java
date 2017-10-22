import java.io.*;
class  D
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("C.java");
		FileOutputStream fout = new FileOutputStream("M.java");
		int i = 0;
		while((i=fin.read()) != -1)
		{
			fout.write((char)i);
		}
		fin.close();
	}
}
