package pack1;
class G 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
		 assert false : test() ;
		//System.out.println(i);
		System.out.println("1");
	}
	static String test()
	{
	System.out.println("done");
	return "abc";
	}
}
class R 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
		 assert false : test() ;
		//System.out.println(i);
		System.out.println("2");
	}
	static String test()
	{
	System.out.println("done");
	return "abc";
	}
}
