class  N
{
	public static void main(String[] args) 
	{
		int i = 0;
		for(i = 0, System.out.println("initialization");i<test();System.out.println("increment"),i++)
		{
		
		System.out.println("body");
		}
		
		
	}
	private static int test()
	{
	System.out.println("Condition check: ");
	return 5;
	}
}
