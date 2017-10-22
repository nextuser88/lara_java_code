package com.rst;
import java.util.Scanner;
class  N
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any day number(dd)");
		System.out.println("in a month");
		String s1= sc.next();
		String s2 = "^([0][1-9]||[12][0-9]||[3][01])$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
