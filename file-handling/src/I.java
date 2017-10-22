import java.io.*;
class  I
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("f1.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Hello World";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		bout.close();
		System.out.println("Success");
	}
}
