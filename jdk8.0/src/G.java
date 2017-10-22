interface D
{
	default void test()
	{
		System.out.println("D-Test");
	}
}
interface E
{
	default void test()
	{
		System.out.println("E-Test");
	}
}
class F implements D, E
{
	public void test()
	{
		System.out.println("F-Test");
	}
}
class G
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.test();
		System.out.println("done");
	}
}
