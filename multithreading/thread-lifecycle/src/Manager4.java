class C extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		synchronized(this)
		{
			try
			{
				wait();
			}
			catch (InterruptedException ex)
			{
			}
		}
		System.out.println("run end");
	}
}

class Manager4
{
	public static void main(String[] args) 
	{
		C a1 = new C();
		a1.start();
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("B wait(): " + a1.getState());
		synchronized(a1)
		{
			a1.notify();
		}
	}
}