package com.lara;
import java.util.HashSet;
import java.util.Collection;
import java.util.Collections;

class S
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		Collection<String> set1 = Collections.unmodifiableSet(set);
		set1.add("xyz");
		System.out.println(set1);
	}
}
