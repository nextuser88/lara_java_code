package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class D
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("ramu", 10);
		map.put("pavan", 20);
		map.put("swathi", 15);
		map.put("vijay", 1);
		map.put("ramana", 11);
		Set<Entry<String,Integer>> entries = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entries);
		Collections.sort(list, new Comparator<Entry<String, Integer>>()
		{
		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer>o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);
	}
}
