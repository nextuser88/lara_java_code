package com.lara;
import java.util.Date;
public class F
{
	public static void main(String[] args) 
	{
		Date d1 = new Date(1000*60*60*24);
		System.out.println(d1);
		System.out.println(d1.getTime());
	}
}
