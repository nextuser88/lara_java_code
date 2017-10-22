interface A
{
	void test1();// Functional Interface
}
class  B implements A
{
	public void test1()
	{
		System.out.println("from test1");
	}
	
}
class Manager1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("main end");
	}
}
