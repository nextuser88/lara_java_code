package com.lara;
public class P implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		P p1 = new P();
		p1.i = 1000;

		P p2 = (P)p1.clone();
		System.out.println(p2.i);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);
	}
}

