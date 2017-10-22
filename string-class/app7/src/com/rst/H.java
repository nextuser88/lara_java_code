package com.rst;
import java.util.Scanner;
class  H
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string format");
		System.out.println("^[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*\\.[a-zA-Z_]{2,}$");
		String s1= sc.next();
		String s2 = "^[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*@[a-zA-Z_0-9]+(\\.[a-zA-Z_0-9]+)*\\.[a-zA-Z_]{2,}$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
