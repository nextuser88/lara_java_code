class Thread1 extends Thread
{
	Object obj;
	Thread1(Object obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int i = 1; i < 100; i += 2)
		{
			System.out.println(i);
			synchronized(obj)
			{
				obj.notify();
				try
				{
					obj.wait();
				}
				catch (InterruptedException ex)
				{
				}
			}
		}
		
	}
}
class Thread2 extends Thread
{
	Object obj;
	Thread2(Object obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		for(int i = 2; i < 100; i += 2)
		{
			System.out.println(i);
			synchronized(obj)
			{
				obj.notify();
				try
				{
					obj.wait();
				}
				catch (InterruptedException ex)
				{
				}
			}
		}
	}
}
class B 
{
	public static void main(String[] args) 
	{
		Object obj = new Object();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.start();
		
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException ex)
		{
		}

		t2.start();

		System.out.println("");
	}
}
