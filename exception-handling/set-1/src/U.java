import java.util.Scanner;
public class U
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String s1 = sc.next();
		int i = test(s1);
		System.out.println(i);
	}
		static int test(String s1)
		{
			int i = 0;
			try
			{			
			i = Integer.parseInt(s1);
			return i;
			}
		
			catch(NumberFormatException ex) 
			{
				return 3;	
			}
			finally
			{
				return 1000;
			}	
		
	  }
	
}
