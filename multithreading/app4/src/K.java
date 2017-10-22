class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getName());
		}
	}
}
class K
{
	static class A extends Thread
	{
		public void run()
		{
			for(int i = 0; i < 20; i++)
			{
				System.out.println("A: " + i);
				Util.sleep(1000);
			}
		}
	}
	static class B extends Thread
	{
		public void run()
		{
			for(int i = 20; i < 40; i++)
			{
				System.out.println("B: " + i);
				Util.sleep(2000);
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		for(int i = 40; i < 60; i++)
		{
			System.out.println("main: " + i);
			Util.sleep(3000);
		}
		
	}
}
