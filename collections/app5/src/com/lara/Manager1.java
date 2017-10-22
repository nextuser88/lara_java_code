package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
public class Manager1
{
	public static void main(String[] args) 
	{
		HashMap map1 = new HashMap();
			map1.put("key", 2000);
			map1.put("abc", 2300);
			map1.put("hello", 2050);
			map1.put("done", 9090);
			map1.put("check", 9190);
			map1.put("test", 9030);
			map1.put("done", 9091);
			System.out.println(map1);
		TreeMap map2 = new TreeMap(map1);
			System.out.println(map2);
	}
}
