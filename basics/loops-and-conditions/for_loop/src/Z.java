class Z
{
	public static void main(String[] args) 
	{
		int i = test();
		System.out.println(i);
	}
	static int test()
	{
		int i  = 0;

		for( i =0; i<10; i++)
		{
			return i;
		}
		return i;
	}
}