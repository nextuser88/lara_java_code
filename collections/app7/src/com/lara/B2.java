package com.lara;
import java.util.ArrayList;
class  B2
{
	public static void main(String[] args) 
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("abc");
		list1.add("abc");
		list1.add("abc");
		list1.add("abc");
		
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
		String s4 = list1.get(3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("Hello world");
	}
}
