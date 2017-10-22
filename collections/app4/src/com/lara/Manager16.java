package com.lara;
import java.util.HashSet;
import java.util.Iterator;
public class Manager16
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add("90");
		set.add(90);
		set.add(90.0);
		System.out.println(set);
	}
}
