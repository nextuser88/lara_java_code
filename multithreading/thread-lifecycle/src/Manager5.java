class D extends Thread
{
	Thread main;
	D(Thread main)
	{
		this.main = main;
	}

	public void run()
	{
		System.out.println("run begin");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println(main.getState());
		System.out.println("run end");
	}
}

class Manager5
{
	public static void main(String[] args) 
	{
		Thread main = Thread.currentThread();
		D a1 = new D(main);
		a1.start();
		try
		{
			a1.join();
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("end");
	}
}

/*

	Whenever calling join method thread going into WAITING state.

*/