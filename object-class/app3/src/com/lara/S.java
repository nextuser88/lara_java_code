package com.lara;
public class S implements Cloneable
{
	int i;
	double j;
	Boolean flag;
	String s1;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		S s1 = new S();
		s1.i = 1000;
		s1.j = 34.90;
		s1.flag = false;
		s1.s1 = "abc";
		S s2 = (S)s1.clone();
		System.out.println(s2.i);
		System.out.println(s2.j);
		System.out.println(s2.flag);
		System.out.println(s2.s1);
		s2.i = 200;
		s2.j = 90.909090;
		s2.s1 = "xyz";
		s2.flag = true;
		System.out.println("-----------");
		System.out.println(s1.i);
		System.out.println(s1.j);
		System.out.println(s1.s1);
		System.out.println(s1.flag);
		
	}
}

