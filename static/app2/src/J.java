class J
{
	// 1st initializer
	static int i = test();
	// 2nd initializer
	static 
	{
		System.out.println("SIB begin");
			main(null);
		System.out.println("SIB end");

	}
	static int test() 
	{
		System.out.println("TEST begin");
			main(null);
		System.out.println("TEST end");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main "+ i);
	}
	
}
