class C implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
class D implements Runnable
{
	public void run()
	{
		for(int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
class  E
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		D d1 = new D();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(d1);
		t1.start();
		t2.start();
		for(int i = 2000; i < 2500; i++)
		{
			System.out.println(i);
		}
		
	}
}
