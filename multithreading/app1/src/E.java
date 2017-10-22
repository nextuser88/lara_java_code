class D extends Thread
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);	
		}
	}
}

class  E
{
	public static void main(String[] args) 
	{
		System.out.println("main started..");
		D d1 = new D();
		d1.start();
		System.out.println("child started..");
		for(int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
		System.out.println("main ended..");
	}
}
