package com.rst;
import java.util.Scanner;
class  P
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any year number(yyyy)");
		System.out.println("in 20th or 21st century");
		String s1= sc.next();
		String s2 = "^(19[0-9]{2}||20[0-9]{2}||2100)$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
