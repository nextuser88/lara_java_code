package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class  Manager19
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(8.9);
		list.add(9);
		list.add(9.0);
		list.add(9.1);		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);			
	}
}
