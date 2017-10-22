class W
{
	static int i=10;

	static int j=test();/*method can be used in the initiliazer. compiler is checking assignment id assignment is proper. Any method
	can be used in initializer.	j data type and test method return type both are the same i.e int. 20 is assigning to j. */
	
	static int test()
	{
		return 20;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}
