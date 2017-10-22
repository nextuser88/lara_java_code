package com.rst;
class  A
{
	public static void main(String[] args) 
	{
		String s1 = "abc@abc.com";
		boolean b1 = Util.check(s1, "^[a-z]");
		System.out.println(b1);
		boolean b2 = Util.check(s1, "^[A-Z]");
		System.out.println(b2);
		boolean b3 = Util.check(s1, "^[a-z]{1,3}");
		System.out.println(b3);
		boolean b4 = Util.check(s1, "^[a-z]{1,3}@[a-z]");
		System.out.println(b4);
		boolean b5 = Util.check(s1, "^[a-z]{1,3}@[a-z]{1,3}\\.[a-z]");
		System.out.println(b5);
		boolean b6 = Util.check(s1, "^[a-z]{1,3}@[a-z]{1,3}\\.[a-z]{1,3}$");
		System.out.println(b6);
		boolean b7 = Util.check(s1, "^[a-z]{1,3}@[a-z]{1,3}\\.[a-z]{4,}$");
		System.out.println(b7);
	}
}
