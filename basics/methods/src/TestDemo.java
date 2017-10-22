class TestDemo 
{
	static int test1()
	{
		System.out.println("from test1");
		return 5;
	}
	static int test2(int i)
	{
		System.out.println("from test2");
		return test1();
	}
	public static void main(String[] args) 
	{
		int i = 0;
		test1();
		System.out.println(test1());
		System.out.println(test2(3)+test1());
		test2(4);
		System.out.println(test1()+ 3*test2(6));
	}
}
