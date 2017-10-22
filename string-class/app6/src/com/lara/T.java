package com.lara;
import java.text.DateFormat;
import java.util.Date;
public class T
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(d1));

	}
}
