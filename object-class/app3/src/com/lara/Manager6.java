package com.lara;
class F implements Cloneable// all objects are elegible for cloning
{
	int i;
	void cloneUsage()
	{
		try
		{
			F f1 = (F)clone();
			System.out.println(f1.i);
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
	}
}
public class Manager6
{
	public static void main(String[] args) 
	{
		F obj = new F();
		obj.i = 3000;
		obj.cloneUsage();
	}
}
