class A extends Thread
{
	public void run()
	{
		for(int i=0; i<150; i++)
			System.out.println(i);
	}
}
class Manager2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("Thread created: " + a1.getState());
		a1.start();
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("After Sleep(1) invoked: " + a1.getState());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("After Sleep(1000) invoked: " + a1.getState());
	}
}
