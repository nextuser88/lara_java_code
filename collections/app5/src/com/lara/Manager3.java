package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
public class Manager3
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
			map.put(80, "abc");
			map.put("abc", "abc");
			System.out.println(map);
	}
}
