package com.lara;
import java.lang.reflect.Method;
class P
{
	void test()
	{
		System.out.println("from test");
	}
}
public class  Manager13
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.P");
		P p1 = (P) c1.newInstance();
		p1.test();

		Object obj = c1.newInstance();
		P p2 = (P) obj;
		p2.test();

		((P)obj).test();

		Object obj1 = c1.newInstance();
		Method m1 = c1.getDeclaredMethod("test");
		m1.invoke(obj1);
	}
}
