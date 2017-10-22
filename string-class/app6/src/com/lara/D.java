package com.lara;
import java.util.Date;
public class D
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		Date d2 = new Date(1000*60);
		Date d3 = new Date(1000*60*60);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
