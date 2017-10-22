package com.lara;
class H
{
	static
	{
		System.out.println("from H.SIB");
	}
}
public class  Manager6
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.H");
		System.out.println("---------------");
		System.out.println(c1);
	}
}
