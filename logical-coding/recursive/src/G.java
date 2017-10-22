class  G
{
	
	static void reversePrint(int i)
	{
		if(i == 0)
		{
			return;
		}	
		System.out.print(i%10);
		reversePrint(i/10);

	}
	public static void main(String[] args) 
	{
		int i = 12345;
		reversePrint(i);
	}
}
