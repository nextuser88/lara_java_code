class C
{
	static int i;

	static void test() 
	{
		System.out.println("from test:"+ i);
	}
}

class D

{
	public static void main(String[] args) 
	{
		System.out.println("from-Main: "+C.i);
			C.test();		
	}
}
