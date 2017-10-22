package com.lara;
import java.util.ArrayList;

class UtilList extends ArrayList
{
	private ArrayList list;
	public UtilList(ArrayList list)
	{
		this.list = list;
	}
	public boolean add(Object e)
	{
		boolean flag = false;
		synchronized(list)
		{
			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
