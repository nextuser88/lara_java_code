import java.io.*;
class Copy
{
	public static void main(String[] args) 
	throws Exception
	{
		File inputFile = new File("abc.txt");
		File outputFile = new File("outagain.txt");
		FileReader in = new FileReader(inputFile);
		FileReader out = new FileReader(outputFile);
		int c;
		while((c = in.read()) != -1)
		{
			System.out.write(c);
		}
		in.close();
		out.close();	
	}
}
