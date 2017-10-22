package com.lara;
import java.util.Calendar;
import java.util.Date;
public class O
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);
		cal.add(Calendar.DATE, 30);
		Date d2 = cal.getTime();
		System.out.println(d2);
	}
}
