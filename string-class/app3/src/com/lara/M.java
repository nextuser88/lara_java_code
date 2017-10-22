package com.lara;
public class M
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("hellojava");		
		sb.deleteCharAt(6);
		sb.trimToSize();	
		System.out.println(sb);		
	}
}
