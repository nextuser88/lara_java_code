package com.lara;
class E
{
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("finalize");
	}
}
public class Manager5
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1 = null;
		System.gc();
		System.out.println("done");
	}

}
