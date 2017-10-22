import java.util.Scanner;
class L 
{
	static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		return num* factorial(num-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner();
		System.out.println("Enter a number: ");
		sc.next();
		int fact = factorial(num);
		System.out.println(fact);
	}
}
