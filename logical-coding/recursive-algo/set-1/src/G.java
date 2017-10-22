class G 
{
	static void reversePrint(int i)
	{
		if(i == 0)
		{
			return;
		}
		System.out.print(i%10);//printing last digit
		reversePrint(i/10);// removing the last digit.
	}
	public static void main(String[] args) 
	{
		int i = 12345;
		reversePrint(i);//calling method.
	}
}
