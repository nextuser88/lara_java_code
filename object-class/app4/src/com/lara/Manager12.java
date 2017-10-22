package com.lara;
class O
{
	O(int i)
	{
		System.out.println("O(int)");
	}
}
public class  Manager12
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("com.lara.O");
		O obj = (O) c1.newInstance();
		System.out.println("done");
	}
}
