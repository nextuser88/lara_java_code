class Z3 
{
	static Thread getThread()
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("run begin");
				System.out.println("run end");
			}
		};
		return t1;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread obj = getThread();
		obj.start();
		getThread().start();
		//two child threads are creating.
		System.out.println("main end");
	}
}
