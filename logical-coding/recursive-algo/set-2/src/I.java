class I
{
	static int digitsCount(int digit)
	{
		if(digit == 0)
		{
			return 0;
		}
		return 1 + digitsCount(digit / 10);
	}

	static int reverseNumber(int number, int digits)
	{
		if(digits == 1)
		{
			return number;
		}
		else
		{
			int x = number %10;
			number = number/10;
			return(int)(x*Math.pow(10,digits-1)+ reverseNumber(number, -- digits));
		}
	}
	public static void main(String[] args) 
	{
		int number = 123456;
		int digitsCount = digitsCount(number);
		System.out.println("digitsCount:" + digitsCount);
		int reverseNum = reverseNumber(number, digitsCount);
		System.out.println(reverseNum);

	}
}
