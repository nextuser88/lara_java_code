class P 
{
	static Runnable getRunnable()
	{
		return new Runnable()
		{
			public void run()
			{
				System.out.println("c begin");
				System.out.println("c end");
			}
		};
	}
	public static void main(String[] args) 
	{
		new Thread(getRunnable()).start();
		System.out.println("done");
	}
}
