class D
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i = 0; i<1000; i++)
				{
					System.out.println(i);
				}
				
			}
		};
		
		t1.start();
		System.out.println(t1.isDaemon());
	}
}
