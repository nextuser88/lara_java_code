package com.lara;
class K
{
	K()
	{
		System.out.println("K()");
	}
	void test()
	{
		System.out.println("test");
	}
}
public class  Manager9
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.K");
		K k1 = (K) c1.newInstance();
		System.out.println("---------");
		K k2 = (K) c1.newInstance();
		System.out.println("---------");
		k1.test();
		k2.test();
		
	}
}
