package com.lara;
class Test
{
	int i;
}
public class  T implements Cloneable
{
	int j;
	Test obj;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test test1 = new Test();
		test1.i = 100;
		T t1 = new T();
		t1.j = 200;
		t1.obj = test1;
		T t2 = (T)t1.clone();
		System.out.println(t2.j);
		System.out.println(t2.obj.i);
		System.out.println("--------");
		t2.j = 3000;
		t2.obj.i = 4000;
		System.out.println(t1.j);
		System.out.println(t1.obj.i);

	}
}
