package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
public class  C
{
	public static void main(String[] args) 
	{
		HashMap <String, Integer> map = new HashMap<String, Integer>(); 
		map.put("ramu", 10);
		map.put("pavan", 20);
		map.put("swathi", 15);
		map.put("vijay", 1);
		map.put("rammana", 11);
		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>(map);
		System.out.println(map1);
	}
}
