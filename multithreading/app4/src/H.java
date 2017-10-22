class H
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i = 0; i< 500; i++)
				{
					System.out.println(i);		
				}
				
			}
		};
		t1.start();

		Thread t2 = new Thread()
		{
			public void run()
			{
				for(int i = 500; i< 1000; i++)
				{
					System.out.println(i);		
				}
				
			}
		};
		
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("main end");		
	}
}
