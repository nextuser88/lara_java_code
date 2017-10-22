package com.lara;
class B
{
	int i;
}
class C
{
	int j;
}
public class W implements Cloneable 
{
	int k;
	B obj1;
	C obj2;
	protected Object clone()
	{
		W w1 = null;
		try
		{
			w1 = (W)super.clone();
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		w1.obj1 = new B();
		w1.obj1.i = obj1.i;// this.obj1.i
		w1.obj2 = new C();
		w1.obj2.j = obj2.j;// this.obj2.j
		return w1;
	}
	public static void main(String[] args) 
	{
		W t1 = new W();
		t1.k = 10;
		t1.obj1 = new B();
		t1.obj2 = new C();
		t1.obj1.i = 20;
		t1.obj2.j = 30;
		W t2 = (W)t1.clone();
		System.out.println(t2.k);
		System.out.println(t2.obj1.i);
		System.out.println(t2.obj2.j);
		t2.k = 40;
		t2.obj1.i = 50;
		t2.obj2.j = 60;
		System.out.println(t1.k);
		System.out.println(t1.obj1.i);
		System.out.println(t1.obj2.j);
	}
}
