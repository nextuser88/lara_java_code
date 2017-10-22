class  A
{
	static void test(int i)
	{
		if(i == 0)
		{
			return;
		}

		test (--i);
		System.out.println("Hello to all!");

	}
	public static void main(String[] args) 
	{
		test(3);
	}
}
