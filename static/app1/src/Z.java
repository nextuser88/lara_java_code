class Z
{	
	static int i = test();/*what test() method is returning compiler is not bothering. compiler will check return type. Whenerver clas is loading
	in the memory while loading every variable is storing in the memory with default value then initializer will be excuting from top to bottom.
	i and j is storing in the memory with default value 0. then initializer will be executing from top to bottom. test() method is executing
	by the time j value is 0. 0 is assigned to i, then j value will be initialized with value 10. Once class is loaded in the memory. main method
	will be executing.*/
	static int j = 10;
	static int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}
