class L 
{
	static class Util
	{
		static void sleep(long millis)
		{
			try
			{
				Thread.sleep(millis);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	static class A extends Thread
	{
		public void run()
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.println("A: " + i);
				Util.sleep(10000);
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		for(int i = 0; i < 10; i++)
		{
			System.out.println("main: " + i);	
			Util.sleep(1000);
			a1.interrupt();
		}
		System.out.println("main end");
	}
}
