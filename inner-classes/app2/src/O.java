class O 
{
	public static void main(String[] args) 
	{
		int i =  10;
		final int j = 20;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		System.out.println("done");
	}
}
