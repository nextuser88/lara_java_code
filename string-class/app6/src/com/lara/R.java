package com.lara;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
public class R
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);
		DateFormat df = DateFormat.getDateInstance();
		String s1 = df.format(d1);
		System.out.println(s1);

	}
}
