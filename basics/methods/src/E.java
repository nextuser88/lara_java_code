class E 
{
public static void test1() 
	{
		System.out.println("from test1");
	}
public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		test2();
		System.out.println("main end");
	}
static void test2() 
	{
		System.out.println("from test2");
	}
	
	
}
