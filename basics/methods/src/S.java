class S 
{
	static int  test() 
	{
		System.out.println("from test");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int i = test();
		System.out.println(i);
		System.out.println("from main end");
	}
}
