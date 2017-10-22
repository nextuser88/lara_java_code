class Z 
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
			public void run()
			{
				System.out.println("A-begin");
				System.out.println("A-end");
			}
		}
		System.out.println("main begin");
		A a1 = new A();
		a1.start();
		System.out.println("main end");
	}
}
