class Z4 
{
	static Thread getThread()
	{
		return new Thread()
		{
			public void run()
			{
				System.out.println("run begin");
				System.out.println("run end");
			}
		};
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		getThread().start();
		getThread().start();
		getThread().start();
		getThread().start();
		System.out.println("main end");
	}
}