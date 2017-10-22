class I 
{
	//1 initializer
	static int i = test();

	// 2 initializer 
	static 
	{
		System.out.println("SIB1");
	}
	static int test() 
	{
		System.out.println("TEST");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("done!");
		System.out.println(i);
	}
	// 3 initializer
	static 
	{
		System.out.println("SIB2");
	}
}
