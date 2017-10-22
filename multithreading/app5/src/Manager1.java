class A
{
	static synchronized void test1()
	{
		for(int i = 0; i< 1000; i++)
		{
			System.out.println("test1: " + i);
		}
	}
	static synchronized void test2()
	{
		for(int i = 0; i< 1000; i++)
		{
			System.out.println("test2: " + i);
		}
	}
}

class Thread1 extends Thread
{
	A a1;
	Thread1(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.test1();
	}
}
class Thread2 extends Thread
{
	A a1;
	Thread2(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.test2();
	}
}
class Manager1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//A a2 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.start();
		t2.start();
	}
}