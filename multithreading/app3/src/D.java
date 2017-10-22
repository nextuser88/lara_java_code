class B extends Thread
{
	public void run()
	{
		Util.printDefaultProperties();
	}
}
class C implements Runnable
{
	public void run()
	{
		Util.printDefaultProperties();
	}
}
class Util
{
	static void printDefaultProperties()
	{
		Thread t1 = Thread.currentThread();
		String name = t1.getName();
		long id = t1.getId();
		int priority = t1.getPriority();
		boolean status = t1.isDaemon();
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("priority:" + priority);
		System.out.println("status:" + status);
	}
}
class  D
{
	public static void main(String[] args) 
	throws InterruptedException
	{
		B b1 = new B();
		b1.start();
		Thread.sleep(10);
		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.start();
		Thread.sleep(10);
		Util.printDefaultProperties();
	}
}
