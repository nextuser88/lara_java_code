class J 
{
	static class A extends Thread
	{
		public void run()
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
				try
				{
					sleep(1000);
				}
				catch (InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		try
		{
			for(int i = 100; i < 110; i++)
			{
				System.out.println(i);		
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
