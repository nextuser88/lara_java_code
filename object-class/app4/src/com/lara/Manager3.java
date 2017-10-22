package com.lara;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
class C
{
	public int i;
	/*public double test1()
	{
		return 2.9;
	}*/
	double test1()
	{
		return 2.9;
	}
}
class D extends C
{
	public int j;
	D(int j)
	{
	}
	/*public void test2()
	{
	}*/
	void test2()
	{
	}
}
public class Manager3
{
	public static void main(String[] args) throws Exception
	{
		D d1 = new D(10);
		Class c1 = d1.getClass();
		Field[] x = c1.getFields();
		for(Field f1 : x)
		{
			System.out.print(f1.getName());
			System.out.println(":" + f1.getType());
		}
		System.out.println("------------");

		Field[] y = c1.getDeclaredFields();
		for(Field f1 : y)
		{
			System.out.print(f1.getName());
			System.out.println(":" + f1.getType());
		}
		System.out.println("------------");

		Method[] z = c1.getMethods();
		for(Method m1 : z)
		{
			System.out.print(m1.getName());
			System.out.println(":" + m1.getReturnType());
		}
		System.out.println("------------");

		Method[] a = c1.getDeclaredMethods();
		for(Method m1 : a)
		{
			System.out.print(m1.getName());
			System.out.println(":" + m1.getReturnType());
		}
		System.out.println("------------");

		Constructor[] b = c1.getDeclaredConstructors();
		for(Constructor con : b)
		{
			System.out.print(con.getName());
			
		}

		System.out.println("------------");

	}
}
