package com.rst;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Util
{
	public static boolean check(String s1, String s2)
	{
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);
		return m1.find();
	}
}
