class H1 
{
	static int addDigit(int number)
	{
		if(number == 0)
		{
			return 0;
		}
		return (number%10 + addDigit(number/10));
	}

	public static void main(String[] args) 
	{
		//int sum = addDigit(12345);
		System.out.println("Sum:" + addDigit(12345));
	}
}
