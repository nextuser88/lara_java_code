package com.rst;
import java.util.Scanner;
class  J
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string format");
		System.out.println("^[0-9]{10}$");
		String s1= sc.next();
		String s2 = "^[0-9]{10}$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
