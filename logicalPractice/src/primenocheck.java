public class primenocheck 
{
public boolean checkPrime(int number)
{
	for (int i = 2; i <= number/2; i++)
	{
		if (number % i == 0)
		{
			return false;
		}
	}
	return true;
}
public static void main(String[] args)
{
	primenocheck pnc = new primenocheck();
	System.out.println(pnc.checkPrime(4));
}
}
