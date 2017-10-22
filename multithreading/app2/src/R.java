class R 
{
	static Thread getThread()
	{
		return new Thread()
		{
			public void run()
			{
				System.out.println("thread");
			}
		};
	}
	static Runnable getRunnable()
	{
		return new Runnable()
		{
			public void run()
			{
				System.out.println("runnable");
			}
		};
	}
	public static void main(String[] args) 
	{
		getThread().start();
		new Thread(getRunnable()).start();
		System.out.println("done!");
	}
}
