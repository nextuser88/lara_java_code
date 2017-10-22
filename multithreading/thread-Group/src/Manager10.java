class B
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class C extends Thread
{
	ThreadLocal obj;
	C(ThreadLocal obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("a: " + obj.get());
		obj.set(1);
		B.sleep(500);
		System.out.println("b: " + obj.get());
		obj.set(2);
		B.sleep(500);
		System.out.println("c: " + obj.get());
		obj.set(3);
	}
}
class D extends Thread
{
	ThreadLocal obj;
	D(ThreadLocal obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("d: " + obj.get());
		obj.set(4);
		B.sleep(500);
		System.out.println("e: " + obj.get());
		obj.set(5);
		B.sleep(500);
		System.out.println("f: " + obj.get());
		obj.set(6);
	}
}
class Manager10
{
	public static void main(String[] args) 
	{
		ThreadLocal t = new ThreadLocal();
		t.set(7);
		C c1 = new C(t);
		c1.start();
		B.sleep(100);
		D d1 = new D(t);
		d1.start();
		B.sleep(10000);
		System.out.println("g: " + t.get());
	}
}
