class F
{
	synchronized void test1(F obj)
	{
		System.out.println("test1 begin");
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException ex)
		{
		}
		obj.test2(this);
		System.out.println("test1 end");
	}

	synchronized void test2(F obj)
	{
		System.out.println("test2 begin");
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException ex)
		{
		}
		obj.test1(this);
		System.out.println("test2 end");
	}
}

class G extends Thread
{
	F obj1, obj2;
	G(F obj1, F obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void run()
	{
		obj1.test1(obj2);
	}
}

class Manager7
{
	public static void main(String[] args) 
	{
		Thread main = Thread.currentThread();
		F obj1 = new F(), obj2 = new F();
		G g1 = new G(obj1,obj2);
		g1.start();
		new Thread()
		{
			public void run()
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ex)
				{
				}
				System.out.println(g1.getState());
				System.out.println(main.getState());
			}
		}.start();
		obj2.test2(obj1);
		System.out.println("done");
	}
}


/*

	When thread is in deadlock condition, thread goes into BLOCKED state.

*/