package com.lara;
public class Q implements Cloneable
{
	int i;
	Q()
	{
		System.out.println("Q()");
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Q q1 = new Q();
		q1.i = 1000;
		System.out.println("-------");
		Q q2 = (Q)q1.clone();
		System.out.println(q2.i);	
	}
}

