package com.lara;
import java.text.NumberFormat;
public class X
{
	public static void main(String[] args) 
	{
		NumberFormat nf = NumberFormat.getInstance();
		double num = 24568.8966696;
		System.out.println(num);
		System.out.println(nf.format(num));
	}
}
