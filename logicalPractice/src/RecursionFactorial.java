class RecursionFactorial 
{
	public int printFactorial(int number)
	{
		if (number == 0)
		{
			return number;
		}
		else
		{
			return printFactorial(number*(number-1));
		}
	}
	public static void main(String[] args) 
	{
		RecursionFactorial rf = new RecursionFactorial();
		System.out.println(rf.printFactorial(5));
	}
}
