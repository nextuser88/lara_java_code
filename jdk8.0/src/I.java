interface H
{
	static void test()
	{
		System.out.println("H-Test");
	}
}
class  I
{
	public static void main(String[] args) 
	{
		H.test();
		System.out.println("done");
	}
}
