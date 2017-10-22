package com.lara;
import java.util.Vector;
public class  ThreadPool
{
	private Vector<GenericThread> pool = new Vector<>();
	public void init()
	{
		GenericThread th = null;
		for(int i = 0; i < 10; i++)
		{
			th = new GenericThread();
			th.start();
			pool.add(th);
		}
	}
	public void release()
	{
		GenericThread th = null;
		for(int i = 0; i < pool.size();)
		{
			th = pool.remove(0);
			th.stop();
		}
	}
	public GenericThread checkOut()
	{
		GenericThread th = null;
		if(pool.size() > 0)
		{
			th = pool.remove(0);
		}
		else
		{
			th = new GenericThread();
			th.start();
		}
		return th;
	}
	public void checkIn(GenericThread th)
	{
		if(pool.size() < 10)
		{
			pool.add(th);
		}
		else
		{
			th.stop();
		}
	}
}
