public class P
{
	static void test() throws ClassNotFoundException
	{
		Class.forName("");
	}
	public static void main(String[] args) 
	{
		
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println(1);
		}		
		
	}

	
}
