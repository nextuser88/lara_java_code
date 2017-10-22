class D

{
	static int i;// initially i is storing in memory with value 0. 

	static
	{
		i =10;// i value is initialized with value 10.
		
	}
	public static void main(String [] args)
	{
		System.out.println(i);// after class is loading i value 10 will be printing.
	}
	
}