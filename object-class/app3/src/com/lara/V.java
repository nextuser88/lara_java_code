package com.lara;
class M
{
	int i;
}
public class V implements Cloneable 
{
	int k;
	M obj;
	public Object clone() throws CloneNotSupportedException
	{
		V v1 = (V)super.clone();
		v1.obj = new M();
		v1.obj.i = obj.i;// v1.obj.i = this.obj.i(this.obj.i = obj1.obj.i = 20;)
		return v1;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		V obj1 = new V();
		obj1.k = 10;
		obj1.obj = new M();
		obj1.obj.i = 20;

		V obj2 = (V)obj1.clone();
		System.out.println(obj2.k);
		System.out.println(obj2.obj.i);

		obj2.k = 30;
		obj2.obj.i = 40;

		
		System.out.println(obj1.k);
		System.out.println(obj1.obj.i);
	}
}
