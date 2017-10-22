class F
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i = 0; i<500; i++)
				{
					System.out.println(i);
				}
				
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				for(int i = 501; i<1000; i++)
				{
					System.out.println(i);
				}
				
			}
		};
		t1.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("done");
	}
}
