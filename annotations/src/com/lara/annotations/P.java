package com.lara.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
@interface Anno5
{
	public int countValue();
}
class P
{
	@Anno5(countValue = 20)
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
