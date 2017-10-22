package com.lara;
public class M44
{
	static void test(String... varArg)
	{
		for(String s1 : varArg)
		{
		System.out.print(s1 + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("abc","hello","test","xyz");
		
	}
}
