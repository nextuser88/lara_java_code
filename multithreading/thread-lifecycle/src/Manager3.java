class B extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("run end");
	}
}

class Manager3
{
	public static void main(String[] args) 
	{
		B a1 = new B();
		a1.start();
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("B sleep(10000): " + a1.getState());
	}
}

/*

	If you call sleep() thread enters into the TIMED_WAITING state

*/