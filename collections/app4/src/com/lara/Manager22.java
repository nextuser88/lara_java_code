package com.lara;
import java.util.HashSet;
class I
{
		int i, j;
		I(int i, int j)
		{
			this.i = i;
			this.j = j;
		}
		public int hashCode()
		{
			return Integer.toString(i).hashCode();
		}
		public boolean equals(Object obj)
		{
			return (obj instanceof I && i == ((I)obj).i);
		}
}
public class Manager22
{
	public static void main(String[] args)
	{
		HashSet set=new HashSet();
		set.add(new I(1,1));	
		set.add(new I(1,3));	
		set.add(new I(1,5));	
		set.add(new I(2,1));	
		System.out.println(set.size());
	}
}
