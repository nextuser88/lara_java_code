class H
{
	void test()
	{
		System.out.println("test:" + this);
	}


	public static void main(String[] args) 
	{
		H h1 = new H(); 
		System.out.println("main:" + h1);
		h1.test();
	}
}
