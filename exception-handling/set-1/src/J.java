public class J
{
	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			int i =10/0;			
		}
		catch(ArithmeticException ex) 
			{
		System.out.println(2);
		System.out.println(ex);
		System.out.println(3);
			}
		System.out.println(4);
	}
	
}
