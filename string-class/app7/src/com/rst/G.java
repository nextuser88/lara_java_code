package com.rst;
import java.util.Scanner;
class  G
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string format");
		System.out.println("^[a-z]+(\\.[a-z]+)*@[a-z]+(\\.[a-z]+)*\\.[a-z]{2,}$");
		String s1= sc.next();
		String s2 = "^[a-z]+(\\.[a-z]+)*@[a-z]+(\\.[a-z]+)*\\.[a-z]{2,}$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
