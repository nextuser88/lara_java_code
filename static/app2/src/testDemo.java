class testDemo
{

	static int test()
	{
		
		return 10;
		// usage of global variable in the initialzer with forward references. Inside initialzer i is using.
		
	}
	static int i = test();

	public static void main(String [] args)
	{
		System.out.println(i);
		System.out.println("done");
	}
	
}