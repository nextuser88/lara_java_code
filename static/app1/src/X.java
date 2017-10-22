class X
{	
	static int test1()
	{
		return 1;
	}
	static int i = test1() + test2();/*i data type is int test1() and test2() return type is same. Inside inializer we can define any method
	 whether methods are already define or will be define later. */
	static int test2()
	{
		return 2;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		
	}
}
