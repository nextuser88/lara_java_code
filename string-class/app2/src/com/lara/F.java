package com.lara;
public class F
{
	public static void main(String[] args) 
	{
		String s1 = "abababab";
		int i = s1.indexOf('b');
		int j = s1.indexOf('a',3);		
		int k = s1.lastIndexOf('b');
		int m = s1.lastIndexOf('a');
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
