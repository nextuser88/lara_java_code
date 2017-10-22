abstract class  A
{
	A()
	{
		System.out.println("A()");	
	}
}
class B extends A
{
	
	B()
	{
		super();	
	}
	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println("Class B");
	}
}
