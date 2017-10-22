package com.lara;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
class  C1
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(20, "abc1");
		map.put(0, "abc2");
		map.put(30, "abc3");
		Set<Entry<Integer, String>> entries = map.entrySet(); 
		for(Entry<Integer, String> entry : entries)
		{
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
	}
}
