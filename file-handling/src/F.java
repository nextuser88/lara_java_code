import java.io.*;
class F 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fn1 = new FileInputStream("f1.txt");
		FileInputStream fn2 = new FileInputStream("f2.txt");
		SequenceInputStream sis = new SequenceInputStream(fn1, fn2);
		int i;
		while((i=sis.read())!= -1){
		System.out.println((char)i);
		}
		sis.close();
		fn1.close();
		fn2.close();
	}
}
