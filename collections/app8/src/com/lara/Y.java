package com.lara;
import java.util.EnumSet;
enum C
{
	abc, xyz, test;
}
public class Y
{
	public static void main(String[] args) 
	{
		EnumSet<C> set = EnumSet.of(C.abc, C.xyz, C.test);
		for(C c1 : set)
		{
			System.out.println(c1);
		}
	}
}
