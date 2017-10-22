class A
{
	int i;
}
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
	A obj;
	C(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("a: " + obj.i);
		obj.i = 1;
		B.sleep(500);
		System.out.println("b: " + obj.i);
		obj.i = 2;
		B.sleep(500);
		System.out.println("c: " + obj.i);
		obj.i = 3;
	}
}
class D extends Thread
{
	A obj;
	D(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("d: " + obj.i);
		obj.i = 4;
		B.sleep(500);
		System.out.println("e: " + obj.i);
		obj.i = 5;
		B.sleep(500);
		System.out.println("f: " + obj.i);
		obj.i = 6;
	}
}
class Manager9
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 7;
		C c1 = new C(a1);
		c1.start();
		B.sleep(100);
		D d1 = new D(a1);
		d1.start();
		B.sleep(10000);
		System.out.println("g: " + a1.i);
	}
}
