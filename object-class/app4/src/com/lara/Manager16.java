package com.lara;
import java.lang.reflect.Method;
class S
{
	int test(String s1)
	{
		System.out.println("test1(String)");
		return 1000;
	}
}
public class  Manager16
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.S");
		Object obj = c1.newInstance();
		Method m1 = c1.getDeclaredMethod("test", String.class);
		int i = (Integer)m1.invoke(obj,"abc");
		System.out.println(i);
	}
}
