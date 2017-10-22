package com.lara;
class J
{
	void test()
	{
		System.out.println("from test");
	}
}
public class  Manager8
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.J");
		J obj1 = (J) c1.newInstance();
		J obj2 = (J) c1.newInstance();
		J obj3 = (J) c1.newInstance();
		obj1.test();
		obj2.test();
		obj3.test();
	}
}
