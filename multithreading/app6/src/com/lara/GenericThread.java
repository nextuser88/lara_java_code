package com.lara;
public class GenericThread extends Thread
{
	public  void run()
	{
		while(true)//never end thread
		{
			//1 keep on wait
			synchronized(this)
			{
				try
				{
					wait();//this.wait()	
				}
				catch (InterruptedException ex)
				{

				}
			}
			for(int i = 0; i < 100; i++)
			{
				System.out.println("generic activity ");
				Util.sleep(100);
			}
			//2 to call notify method.
			synchronized(this)
			{
				notify();//this.notify()
			}
		}
	}
}
