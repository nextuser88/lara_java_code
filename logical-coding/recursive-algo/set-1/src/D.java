class  D
{
	static void test(int i)
	{
		System.out.println(i);
		if(i == 0)
		{
			return;
		}
		test(--i);
		
	}
	public static void main(String[] args) 
	{
		test(5);
	}
}
