package com.lara;
class  M
{
	public static void main(String[] args) 
	{
		int[] x = new int[2];
		int[] y = x;
		Object obj = y;
		int[] z = (int[])obj;
		System.out.println("done");
	}
}
