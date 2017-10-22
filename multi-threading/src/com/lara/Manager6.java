package com.lara.app1;

	class Thread1 extends Thread
	{
		public void run()
		{
		for(int i =0;i<1000;i++)
			{
		System.out.println(i);
			}
		}
	}
public class  Manager6
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread1();
		t1.start();
		for(int i =1000; i<2000;i++)
		{
		System.out.println(i);
		}
				
	}
}
