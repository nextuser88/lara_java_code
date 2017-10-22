class  C
{
	static void test(int i)
	{
		if(i == 0)
		{
			return;
		}
		test(--i);
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		test(5);
	}
}
