package com.lara;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class T
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 11);
		Map<String, Integer>map1 = Collections.unmodifiableMap(map);
		map1.put("xyz", 22);
		System.out.println(map1);
	}
}
