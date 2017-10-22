class A
{
	synchronized void test1()
	{
		System.out.println("test1 begin");
		try
		{
			wait();//this.wait()//a1.wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 end");
	}
	synchronized void test2()
	{
		System.out.println("test2 begin");
		notifyAll();
		System.out.println("test2 end");
	}
}
class Thread1 extends Thread
{
	A obj;
	Thread1(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class Thread2 extends Thread
{
	A obj;
	Thread2(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class Thread3 extends Thread
{
	A obj;
	Thread3(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class Thread4 extends Thread
{
	A obj;
	Thread4(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test2();
	}
}
class  Manager3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		Thread3 t3 = new Thread3(a1);
		Thread4 t4 = new Thread4(a1);
		t1.start();
		t2.start();
		t3.start();
		try
		{
			Thread.sleep(1);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		t4.start();
		System.out.println("main end");
	}
}
