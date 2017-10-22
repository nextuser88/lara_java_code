package com.lara;
import java.lang.reflect.Method;
import java.util.Scanner;
class T
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class U
{
	void test2()
	{
		System.out.println("from test2");
	}
}
public class Manager17
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class Name: ");
		String className = sc.next();
		System.out.println("Enter Method Name: ");
		String methodName = sc.next();
		Class c1 = Class.forName(className);
		Method m1 = c1.getDeclaredMethod(methodName);
		Object obj = c1.newInstance();
		m1.invoke(obj);
		System.out.println("done");
	}
}
