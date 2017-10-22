package com.lara;
import java.util.HashMap;
class  B
{
	int i;
	B(int i)
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
		return i == ((B)obj).i;
	}
}
public class X
{	
	public static void main(String[] args)
	{
		HashMap<B, String> map = new HashMap<>();
		map.put(new B(10), "abc");
		map.put(new B(10), "xyz");
		System.out.println(map);
	}
}
