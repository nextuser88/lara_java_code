class A
{
	private void test()
	{
		System.out.println("test-A");
	}
}
class B extends A
{
	private void test()
	{
		System.out.println("test-B");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		//a1.test();
		B b1 = new B();
		b1.test();
		System.out.println("C");
	}
}
/*
class  C
{
	
}*/
