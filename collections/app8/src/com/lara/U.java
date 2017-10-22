package com.lara;
import java.util.WeakHashMap;
class Test
{
	protected void finalize()throws Throwable
	{
		System.out.println("removed");
	}
}
public class U
{
	public static void main(String[] args) 
	{
		WeakHashMap<Test, Integer>  map = new WeakHashMap<Test, Integer>();
		Test t1 = new Test();
		map.put(t1, 12);
		t1 = null;
		System.gc();
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println(map);
	}
}
