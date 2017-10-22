class A implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println(i);
		}
	}
}
class  B
{
	public static void main(String[] args) 
	{
		A a1 = new A();//runnable type.
		Thread t1 = new Thread(a1);// creating a object to thread class by supplying runnable interface.
		t1.start();
		for(int i = 1000; i<2000; i++)
		{
			System.out.println(i);
		}
		
	}
}
