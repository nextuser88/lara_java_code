package com.lara;
import java.util.HashMap;
class Test
{
	protected void finalize()throws Throwable
	{
		System.out.println("removed");
	}
}
public class V
{
	public static void main(String[] args) 
	{
		HashMap<Test, Integer>  map = new HashMap<Test, Integer>();
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
