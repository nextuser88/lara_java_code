package com.lara;
public class R implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		R r1 = new R();
		r1.i = 1000;
		R r2 = (R)r1.clone();
		System.out.println(r2.i);
		r2.i = 2000;
		System.out.println(r1.i);
		r1.i = 3000;
		System.out.println(r2.i);
		
	}
}

