class A extends Thread
{
	A(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	public void run()
	{
		for(int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
class B extends Thread
{
	B(ThreadGroup tg, String name)
	{
		super(tg, name);
	}
	public void run()
	{
		for(int i = 1000; i < 1500; i++)
		{
			System.out.println(i);
		}
	}
}
class C implements Runnable
{
	public void run()
	{
		for(int i = 3000; i < 3500; i++)
		{
			System.out.println(i);
		}
	}
}
class Manager8 
{
	public static void main(String[] args) 
	{
		ThreadGroup tg = new ThreadGroup("gr1");
		A a1 = new A(tg, "first child");
		B b1 = new B(tg, "2nd child");
		C c1 = new C();
		Thread t1 = new Thread(tg, c1, "3rd child");
		Thread t2 = new Thread(tg, c1, "4th child");
		a1.start();
		b1.start();
		t1.start();
		t2.start();
		tg.stop();// all threads can stopped by tg.stop().
		System.out.println("done");
	}
}
