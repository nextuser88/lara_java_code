class R extends Thread
{
	public void run()
	{
		System.out.println("R: " + getPriority());
		setPriority(7);
		S s1 = new S();
		s1.start();
	}
}
class S extends Thread
{
	public void run()
	{
		System.out.println("S: " + getPriority());
		setPriority(6);
		T t1 = new T();
		t1.start();
	}
}
class T extends Thread
{
	public void run()
	{
		System.out.println("T: " + getPriority());
	}
}
class U
{
	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		t1.setPriority(10);
		R r1 = new R();
		r1.start();
	}
}
