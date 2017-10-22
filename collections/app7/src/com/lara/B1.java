package com.lara;
import java.util.ArrayList;
class  B1
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(9.0);
		list1.add("abc");
		System.out.println(list1);
		int i = (Integer)list1.get(0);
		double j = (Double)list1.get(1);
		int k = (Integer)list1.get(2);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
