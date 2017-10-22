import java.io.*;
class  B
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("abc.txt");
			String s = "hello laroites..";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success..");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}
