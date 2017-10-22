package com.lara;
import java.lang.reflect.Method;
class Q
{
	void test()
	{
		System.out.println("test");
	}
}
public class  Manager14
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.Q");
		Object obj = c1.newInstance();
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(obj);
		System.out.println("done");
	}
}
