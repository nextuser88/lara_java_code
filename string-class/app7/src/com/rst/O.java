package com.rst;
import java.util.Scanner;
class  O
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any month number(mm)");
		System.out.println("in a year");
		String s1= sc.next();
		String s2 = "^([0][1-9]||[1][012])$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
