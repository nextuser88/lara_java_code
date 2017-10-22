package com.lara;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
class B
{
	int i;
	void test()
	{
	
	}
}
public class Manager2
{
	public static void main(String[] args) throws Exception
	{
		B b1 = new B();
		Class c1 = b1.getClass();
		Field[] x = c1.getDeclaredFields();
		for(Field f1 : x)
		{
			System.out.println(f1.getName());
			System.out.println(f1.getType());
		}
		System.out.println("------------");
		Method[] y = c1.getDeclaredMethods();
		for(Method m1 : y)
		{
			System.out.println(m1.getName());
			System.out.println(m1.getReturnType());
		}
	}
}
