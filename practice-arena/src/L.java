public class L 
{
	static int factorial(int n)
	{
		if(n == 0 || n == 1)
		{
			return 1;
		}

		return n*factorial(n-1);
	}
	public static void main(String[] args) 
	{
		int n = 7;
		System.out.println("factorial of " + n +  " is " + factorial(n));
	}
}
