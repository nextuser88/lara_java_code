abstract class  A
{
	public static void main(String[] args) 
	{
		System.out.println("A-class");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.main();
		System.out.println("Class B");
	}
}
