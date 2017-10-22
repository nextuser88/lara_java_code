package com.lara;
class  O
{
	String s1;
}
public class Manager15
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.s1 = "abc";
		O o2 = new O();
		o2.s1 = "abc";
		O o3 = o2;
		System.out.println(o1 == o2);
		System.out.println(o3 == o2);
		System.out.println(o1 == o3);

	}
}
