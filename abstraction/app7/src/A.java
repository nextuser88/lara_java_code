class  A
{
	void test1()
	{
		System.out.println("from A-test1");
	}
	void test2()
	{
		System.out.println("from A-test2");
	}

}
class B extends A
{
	void test3()
	{
		super.test1();
		super.test2();
		test1();
		test2();
	}
	void test2()
	{
		System.out.println("from B-test2");
	}
	public static void main(String[] args)
	{
		B b1 = new B();
		b1.test3();
		System.out.println("done");
	}
}
