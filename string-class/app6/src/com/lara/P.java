package com.lara;
import java.util.Calendar;
import java.util.Date;
public class P
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);

		cal.roll(Calendar.DATE, 20);
		Date d2 = cal.getTime();
		System.out.println(d2);
	}
}
