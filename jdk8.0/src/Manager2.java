interface C
{
	void test1();
}
class  Manager2
{
	public static void main(String[] args) 
	{
		//C c1 = new C();
		//Anonymous inner class.
		C c2 = new C()
		{
			public void test1()
			{
				System.out.println("from test1");
			}
		};
		c2.test1();
		System.out.println("main end");
	}
}
