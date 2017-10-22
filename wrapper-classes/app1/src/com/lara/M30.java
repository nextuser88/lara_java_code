package com.lara;
public class M30
{
	static void test(Double obj)
	{
		System.out.println("done");
	}
	public static void main(String[] args) 
	{
		Double d1 = new Double(20);
		double d2 = 20;
		test(d1);
		test(new Double(d2));
	}
}
