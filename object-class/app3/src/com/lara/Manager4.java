package com.lara;
class D
{
	D obj;
	protected void finalize() throws Throwable
	{
		System.out.println("finalize");
	}
}
public class Manager4
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		
		d1.obj = d2;
		d2.obj = d3;
		d3.obj = d1;
		
		d1 = d2 = d3 = null;
		//d1 = d2 = null;
		System.gc();
		System.out.println("done");
	}
}
