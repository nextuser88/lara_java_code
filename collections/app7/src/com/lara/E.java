package com.lara;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class E
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
		TreeSet<Entry<String, Integer>> set= new TreeSet<Entry<String, Integer>>(new Comparator<Entry<String, Integer>>()

																				{

																				@Override
																				public int compare(Entry<String, Integer> o1, 
																					Entry<String, Integer>o2)
																					{
																				return o1.getValue().compareTo(o2.getValue());
																					}
																				});


		set.addAll(entries);													
		System.out.println(set);
	}
}
