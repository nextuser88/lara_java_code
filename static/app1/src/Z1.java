class Z1
{	
	static int i = test();/*To execute any class that class should be available in the memory. while storing every member will be available 
	in the memory.	When class is loading in the memory after i is storing in the memory with value 0 then executing initializer 
	test() method return value of 10 will be assigned in the variable i. Before executing main method whatever content is there inside the
	initializer that will be completed first.*/

	static int test()
	{
		System.out.println("from test:");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin:");
		System.out.println(i);
		System.out.println("main end");
		
	}
}
/*
step1: every global variable will be stored with default 
*/