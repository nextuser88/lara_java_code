import java.util.Scanner;
public class Manager1
{

public static void main(String[] args)
	{
		String s1 = null;
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1.toString());
			System.out.println(2);
			i = i/(i-9);
			System.out.println(3);
		}
		catch (ArithmeticException | NumberFormatException | NullPointerException ex)
		{
			System.out.println(4);
			System.out.println(ex);
		}
		
		System.out.println(5);
	}
}