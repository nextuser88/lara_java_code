class M 
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
			while(true)
			{
				//System.out.println(isInterrupted());
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				for(int i = 0; i < 10000; i++){}
				System.out.println(isInterrupted()); 
				Util.sleep(1);
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		Util.sleep(10000);
		while(true)
		{
			a1.interrupt();
			Util.sleep(2000);
		}
		
	}
}
