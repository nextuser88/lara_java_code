class Z1 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("AIC-begin");
				System.out.println("AIC-end");
			}
		};
		System.out.println("main begin");
		t1.start();
		System.out.println("main end");
	}
}
