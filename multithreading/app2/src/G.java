class F implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 500; i++)
		{
			System.out.println(i);
		}
	}
}
class  G
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f1);
		Thread t3 = new Thread(f1);
		t1.start();
		t2.start();
		t3.start();
		for(int i = 2000; i < 3000; i++)
		{
			System.out.println(i);
		}
		
	}
}
