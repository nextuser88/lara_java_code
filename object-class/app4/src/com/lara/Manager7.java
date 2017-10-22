package com.lara;
class I
{
	void test()
	{
		System.out.println("from test");
	}
}
public class  Manager7
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.I");
		I obj = (I) c1.newInstance();
		obj.test();
	}
}
