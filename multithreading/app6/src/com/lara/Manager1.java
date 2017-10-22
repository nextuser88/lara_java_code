package com.lara;
public class  Manager1
{
	public static void main(String[] args) 
	throws InterruptedException
	{
		ThreadPool tp = new ThreadPool();
		tp.init();
		GenericThread t1 = tp.checkOut();
		synchronized(t1)
		{
			t1.notify();
			t1.wait();
		}
		System.out.println("usage got over");
		tp.checkIn(t1);
		Util.sleep(10000);

		GenericThread t2 = tp.checkOut();
		synchronized(t2)
		{
			t2.notify();
			t2.wait();
		}
		System.out.println("usage got over");
		tp.checkIn(t2);
		System.out.println("main end");
	}
}
