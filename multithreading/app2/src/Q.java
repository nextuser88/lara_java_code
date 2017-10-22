class Q 
{
	static Thread getThread()
	{
		return new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("c begin");
				System.out.println("c end");
			}
		});
	}
	public static void main(String[] args) 
	{
		getThread().start();
		System.out.println("done!");
	}
}
