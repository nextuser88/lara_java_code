class H extends Thread
{
	public void run()
	{
		for(int i = 0; i < 500; i++)
		{
			System.out.println("from H: " + i);
		}
		
	}
}
class I extends Thread
{
	public void run()
	{
		for(int i = 0; i < 500; i++)
		{
			System.out.println("from I: " + i);
		}
		
	}
}
class  J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H h1 = new H();
		h1.start();
		I i1 = new I();
		i1.start();
		for(int i = 0; i < 1000; i++)
		{
			System.out.println("main: " + i);
		}
		System.out.println("main end");
	}
}
