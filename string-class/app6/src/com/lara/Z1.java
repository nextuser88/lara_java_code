package com.lara;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Z1
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 20);
		Date d1 = cal.getTime();
		System.out.println(d1);
		DateFormat df1 = DateFormat.getDateInstance();
		
		String s1 = df1.format(d1);
		System.out.println(s1);

		Date d2 = null;
		try
		{
			d2 = df1.parse(s1);
			System.out.println(d2);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}	
		
	}
}
