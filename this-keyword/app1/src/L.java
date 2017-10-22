class L
{
	int i;
	void test1()
	{
		System.out.println("from test1:" + i);
		i = 10;
		test2();// this.test2()
	}
	void test2()
	{
		System.out.println("from test2:" + i);
		i = 20;
	}
	public static void main(String[] args) 
	{
		L l1 = new L(); 
		System.out.println("main1:" + l1.i);
		l1.test1();
		System.out.println("main2:" + l1.i);
		l1.i = 30;
		l1.test2();
		System.out.println("main3:" + l1.i);
	}
}
