class F extends Thread 
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);	
		}
	}
}
class  G
{
	public static void main(String[] args) 
	{
		System.out.println("main started...");
		F f1 = new F();
		f1.start();
		System.out.println(".............");
		F f2 = new F();
		f2.start();
		System.out.println(".............");

		for(int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
		System.out.println("main ended..");
	}
}