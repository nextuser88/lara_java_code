interface R
{
	static void test()
	{
		System.out.println("from R-test");
	}
}
class S implements R 
{
	public static void main(String[] args) 
	{
		R.test();
		//S.test();
		System.out.println("done");
	}
}
