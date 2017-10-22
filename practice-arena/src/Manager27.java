package com.lara;
import java.util.ArrayList;
import java.util.ListIterator;

public class Manager27
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		ListIterator itr = list.listIterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj.equals(91));
			{
				itr.set("abc");
			}
			System.out.print(obj + ", ");
		}
		System.out.println();
		System.out.println(list);
	}
}
