package com.lara;
import java.text.NumberFormat;

public class Z3
{
	public static void main(String[] args) 
	{
		double num = 987557.98979;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		
		System.out.println(num);
		String s1 = nf1.format(num);
		System.out.println(s1);		
	}
}
