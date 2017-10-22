package com.lara;
class L
{
	L()
	{
		System.out.println("L()");
	}
	L(int i)
	{
		System.out.println("L(int)");
	}
}
public class  Manager10
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.L");
		L obj1 = (L) c1.newInstance();
		System.out.println("---------");
		L obj2 = (L) c1.newInstance();	
		System.out.println("---------");
	}
}
