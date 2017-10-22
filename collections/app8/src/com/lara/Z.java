package com.lara;
import java.util.HashMap;

class D
{
	int i;
	D(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "(i = " + i +")";
	}
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	public boolean equals(Object obj)
	{
		return i == ((D)obj).i;
	}
}
class  Z
{
	public static void main(String[] args) 
	{
		HashMap<D, String> map = new HashMap<>();
		D d1 = new D(10);
		D d2 = new D(11);
		D d3 = new D(12);
		map.put(d1, "abc");
		map.put(d2, "xyz");
		map.put(d3, "test");

		System.out.println(map);
		d3.i = 11;
		System.out.println(map);
		String s1 = map.remove(d3);
		System.out.println(s1);
		System.out.println(map);
	}
}
