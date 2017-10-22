package com.lara;
import java.text.NumberFormat;
import java.util.Locale;
public class Y
{
	public static void main(String[] args) 
	{
		double num = 24568.8966696;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
		System.out.println(num);
		System.out.println(nf.format(num));
	}
}
