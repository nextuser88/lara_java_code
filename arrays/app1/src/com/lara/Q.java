package com.lara;
class  Q
{
	public static void main(String[] args) 
	{
		test(new int[]{10,20});
	}
	static void test(int[] x)
	{
		System.out.println(x.length);
		for(int i : x)
		{
			System.out.println(i);
		}
	}
}
