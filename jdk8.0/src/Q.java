interface O
{
	static void test()
	{
		System.out.println("from O-test");
	}
}
interface P extends O
{
}
class Q 
{
	public static void main(String[] args) 
	{
		O.test();
		//P.test();
		System.out.println("done");
	}
}
