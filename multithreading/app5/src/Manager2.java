import java.lang.management.*;
import java.util.Arrays;
class Util
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
class  Shared
{
	synchronized  void test1(Shared s1)
	{
		System.out.println("test1 begin");
		Util.sleep(1000);
		s1.test2(this);
		System.out.println("test1 end");
	}
	synchronized  void test2(Shared s1)
	{
		System.out.println("test2 begin");
		Util.sleep(1000);
		s1.test1(this);
		System.out.println("test2 end");
	}
}
class Thread1 extends Thread
{
	Shared s1, s2;
	Thread1(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class Thread2 extends Thread
{
	Shared s1, s2;
	Thread2(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s2.test2(s1);
	}
}
class Manager2
{
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		Thread1 t1 = new Thread1(s1, s2);
		Thread2 t2 = new Thread2(s1, s2);
		t1.start();
		t2.start();
		Util.sleep(1000);
		ThreadMXBean tx = ManagementFactory.getThreadMXBean();
		long[] ids = tx.findDeadlockedThreads();

		//System.out.println(Arrays.toString(ids));
		if(ids != null)
		{
			System.out.println("deadlocked Threads..");
			ThreadInfo[] infos = tx.getThreadInfo(ids);
			for(ThreadInfo ti : infos)
			{
				System.out.println(ti.getThreadName());
			}
		}
		else
		{
			System.out.println("No threads are under deadlock");
		}
		
		System.out.println("main end");
	}
}