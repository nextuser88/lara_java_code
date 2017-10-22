class U 
{
	
	public static void main(String[] args) 
	{
		try
	{
		int i = 10/0;
	}
	catch (ArithmeticException ex)
	{
		System.out.println(ex);
	}
	
	catch (RuntimeException ex1)
	{
		System.out.println(ex1);
	}
	catch (Exception ex2)
	{
		System.out.println(ex2);
	}
	catch (Throwable t)
	{
		System.out.println(t);
	}
	}
}
