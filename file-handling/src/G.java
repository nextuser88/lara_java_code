import java.io.*;
class  G
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin1 = new FileInputStream("f1.txt");
		FileInputStream fin2 = new FileInputStream("f2.txt");
		FileOutputStream fout = new FileOutputStream("f3.txt");

		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
		int i;
		while((i = sis.read())!= -1)
		{
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("done!");
	}
}
