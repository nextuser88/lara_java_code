package com.lara;
class A
{
	int i;
}
public class  U implements Cloneable
{
	int k;
	A a1;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		U u1 = new U();
		u1.k = 10;
		u1.a1 = new A();
		u1.a1.i = 20;

		U u2 = (U)u1.clone(); 
		System.out.println(u2.k);
		System.out.println(u2.a1.i);

		System.out.println("-----------");
		u1.k = 30;
		u1.a1.i = 40;
		System.out.println(u2.k);
		System.out.println(u2.a1.i);
	}
}
