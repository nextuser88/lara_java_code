package com.lara;
import java.util.IdentityHashMap;
class  A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i = " + i + ")";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		return i == ((A)obj).i;
	}
}
public class W
{
	public static void main(String[] args)
	{
		IdentityHashMap<A, String> map = new IdentityHashMap<>();
		map.put(new A(10), "abc");
		map.put(new A(10), "xyz");
		System.out.println(map);
	}
}
