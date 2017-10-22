package com.rst;
import java.util.Scanner;
class  Q
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date in ");
		System.out.println("the dd mm yyyy");
		String s1= sc.next();
		String s2 = "^(([0][1-9][\\s])||([12][0-9][\\s])||([3][01][\\s])([0][1-9][\\s])||([1][012][\\s])||(19[0-9]{2}||20[0-9]{2}||21000))$";
		boolean b1 = Util.check(s1,s2);
		System.out.println(b1);

	}
}
