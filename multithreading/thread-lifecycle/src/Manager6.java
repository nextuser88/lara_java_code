class E extends Thread
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

class Manager6
{
	public static void main(String[] args) 
	{
		E a1 = new E();
		a1.start();
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println(a1.getState());
		a1.stop();
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException ex)
		{
		}// It will not immediately, so 1 millisec sleep
		System.out.println(a1.getState());
	}
}