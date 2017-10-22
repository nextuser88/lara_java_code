package com.lara;
public class O
{
	public static void main(String[] args) 
	{
		E.find("a1b2c3d45e89&97%26","\\d");
		System.out.println("--------");
		E.find("a1b2c3d454553658e89&97%26","\\d+");
		System.out.println("--------");
	}
}
