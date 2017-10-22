package com.lara.app1;

class D extends Thread
{
	public void run()
	{
		for(int i =0;i<1000;i++)
		{
			System.out.println(i);
		}
	}
}
	
public class  Manager9
{

	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.start();
		D d2 = new D();
		d2.start();
		
		System.out.println("done");
		
				
	}
}
