class A
{
	A(String s)
	{
	}
	A()
	{
	}
}
class B extends A
{
	B()
	{
	}
	B(String s)
	{
		super(s);
	}
	void test()
	{
		A a = new B();		 
	}
	
}
