package com.lara;
public class N implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		N n1 = new N();
		n1.i = 10;

		N n2 = (N)n1.clone();
		System.out.println(n2.i);
	}
}

