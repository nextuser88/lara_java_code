public class J 
{
	static int sumOfDigits(int number)
	{
	if(number == 0)
		{
			return 0;
		}
		return (number%10)+ sumOfDigits(number/10);
	}

	
	public static void main(String[] args) 
	{
		int num = sumOfDigits(12345);
		System.out.println("sum: "+ num);
	}


}
