class  Y1
{
	static int test1() 
	{
		System.out.println("from test1");
		return 100;
	}
	static int test2() 
	{
		System.out.println("from test2");
		return test1();
	}
	public static void main(String[] args) 
	{
		test1();
		System.out.println(test2());
		System.out.println(test2()+test1());
		test2();
	}
}