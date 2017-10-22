interface U
{
	void test1();
	void test2(int i);
	double test3(boolean b);
}

abstract class V implements U
{
	public void test2()
	{
		System.out.println("from test2");
	}
}
abstract class W implements V
{
	public void test1()
	{
		System.out.println("from test1");
	}
}

class X extends W
{
	public boolean test3(boolean b)
	{
		System.out.println("from test3");
		return 29.89;
	}
	void test4()
	{
		System.out.println("from test4");
	}
	public static void main(String[] args) 
	{
		X obj = new X();
		obj.test1();
		obj.test2(30);
		obj.test4();
		System.out.println(obj.test3(true));
	}
}
