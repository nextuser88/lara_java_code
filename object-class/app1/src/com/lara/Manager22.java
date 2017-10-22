package com.lara;
class  V
{
	int i,j;
	V(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public boolean equals(Object obj)
	{
		V v2 = (V) obj;
		boolean flag = (this.i == v2.i && this.j == v2.j);
		return flag;
	}
}
public class Manager22
{
	public static void main(String[] args) 
	{
		V v1 = new V(20,40);
		V v2 = new V(20,40);
		System.out.println(v1.equals(v2));
	}
}
