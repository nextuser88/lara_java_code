class O 
{
	enum Test
	{
		c1,c2,c3,c4;
	}
	public static void main(String[] args) 
	{
		Test t1 = Test.c2;
		Test t2 = Test.c4;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i = Test.c3.ordinal();
		System.out.println(i);
	}
}
