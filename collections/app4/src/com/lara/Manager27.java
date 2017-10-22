package com.lara;
import java.util.Collections;
import java.util.TreeSet;
class J
{
	int x;
	J(int x)
	{
		this.x = x;
	}
	public String toString()
	{
		return "x= " + x;
	}
}
public class Manager27
{
	public static void main(String[] args)
	{
		TreeSet set=new TreeSet();
		set.add(new J(10));				
		set.add(new J(20));				
		set.add(new J(15));				
		set.add(new J(1));				
		System.out.println(set);
	}
}