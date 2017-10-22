package com.rst;
import java.util.Scanner;
class  I
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string format");
		System.out.println("^0[0-9]{2}-[0-9]{8}$");
		String s1= sc.next();
		String s2 = "^0[0-9]{2}-[0-9]{8}$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
