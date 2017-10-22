class W 
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
			public void run()
			{
				System.out.println("done");	
			}
		}
		A a1 = new A();
		a1.setPriority(Thread.MAX_PRIORITY);
		a1.start();
		System.out.println("main end");
	}
}

