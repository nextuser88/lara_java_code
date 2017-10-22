class  E
{
	static int test(int digit)
	{
		
		if(digit == 0)
		{
			return 0;
		}
		return 1 + test(digit/10);
		
	}
	public static void main(String[] args) 
	{
		int digitCount = test(12345);
		System.out.println(digitCount);
	}
}
