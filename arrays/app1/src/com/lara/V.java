package com.lara;
import java.util.Arrays;
class  V
{
	public static void main(String[] args) 
	{
		String[] x = {"abc","aBc","ABC","123","ABC","Abc","9899","9999"};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
